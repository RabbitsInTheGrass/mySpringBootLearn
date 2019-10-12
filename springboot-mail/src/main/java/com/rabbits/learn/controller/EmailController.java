package com.rabbits.learn.controller;

import com.rabbits.learn.util.JmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;

import java.io.File;

/**
 * @Description: 发送邮件类
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/2 09:39
 */
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private JmsUtil jmsUtil;

    /**
     * 发送简单的邮件
     *
     * @return 发送结果
     */
    @RequestMapping("sendSimpleEmail")
    public String sendSimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        // 接收地址
        message.setTo("2398937985@qq.com");
        // 标题
        message.setSubject("一封简单的邮件");
        // 内容
        message.setText("使用Spring Boot发送简单邮件。");
        return jmsUtil.sendSimpleEmail(message);
    }

    /**
     * 发送HTML格式的邮件
     *
     * @return 发送结果
     */
    @RequestMapping("sendHtmlEmail")
    public String sendHtmlEmail() {
        // 接收地址
        String toAddress = "2398937985@qq.com";
        // 标题
        String subject = "一封HTML格式的邮件";
        // 带HTML格式的内容
        StringBuilder sb = new StringBuilder("<p style='color:#42b983'>");
        sb.append("使用Spring Boot发送HTML格式邮件。");
        sb.append("</p>");
        return jmsUtil.sendHtmlEmail(toAddress, subject, sb.toString());
    }

    /**
     * 发送带附件的邮件
     *
     * @return 发送结果
     */
    @RequestMapping("sendAttachmentsMail")
    public String sendAttachmentsMail() {
        // 接收地址
        String toAddress = "2398937985@qq.com";
        // 标题
        String subject = "一封带附件的邮件";
        // 内容
        String text = "详情参见附件内容！";
        // 传入附件
        FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/file/打印机添加方法.doc"));
        return jmsUtil.sendAttachmentsMail(toAddress, subject, text, file);
    }

    /**
     * 发送带静态资源的邮件
     *
     * @return 发送结果
     */
    @RequestMapping("sendInlineMail")
    public String sendInlineMail() {
        // 接收地址
        String toAddress = "2398937985@qq.com";
        // 标题
        String subject = "一封带静态资源的邮件";
        String contentId = "img";
        // 内容
        String text = "<html><body>一份美图：<img src='cid:" + contentId + "'/></body></html>";
        // 传入附件
        FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/img/yourName.jpg"));
        return jmsUtil.sendInlineMail(toAddress, subject, text, file, contentId);
    }

    /**
     * 发送模板邮件
     *
     * @param code 验证码
     * @return 发送结果
     */
    @RequestMapping("sendTemplateEmail")
    public String sendTemplateEmail(String code) {
        //接收地址
        String toAddress = "2398937985@qq.com";
        //标题
        String subject = "发送一份模板邮件";
        //邮件模板
        String templateName = "emailTemplate";
        Context context = new Context();
        context.setVariable("code", code);
        return jmsUtil.sendInlineMail(toAddress, subject, templateName, context);

    }
}