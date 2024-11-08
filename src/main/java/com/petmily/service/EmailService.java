package com.petmily.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendTemporaryPasswordEmail(String userEmail, String temporaryPassword) {
        MimeMessage message = javaMailSender.createMimeMessage();
        
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");


        try {
            helper.setTo(userEmail);
            helper.setSubject("펫밀리 임시 비밀번호 발급");
            String htmlContent =
            	"<p style='color: #193264; font-size: 16px;'>고객님의 임시 비밀번호는 <strong>"
                    + temporaryPassword + "</strong>입니다.</p>";
            helper.setText(htmlContent, true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        javaMailSender.send(message);
    }

	public void sendEmail(String getEmailByName, String answer_content) {
		SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(getEmailByName);	// 이메일주소
        message.setSubject("[펫밀리]상품 문의에 대한 답변");
        message.setText("상품 문의에 대한 답변 내용: " + answer_content);

        javaMailSender.send(message);
	}
}