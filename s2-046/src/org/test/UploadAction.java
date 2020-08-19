package org.test;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

public class UploadAction extends ActionSupport {

    private String contentType;
    private File upload; //对应upload.jsp中<s:file name="upload">
    private String fileName;
    private String caption;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }
}
