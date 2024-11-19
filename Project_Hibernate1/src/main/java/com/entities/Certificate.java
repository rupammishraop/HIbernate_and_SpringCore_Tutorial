package com.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {

    private String certificateName;
    private String duration;

    public Certificate(String certificateName, String duration) {
        this.certificateName = certificateName;
        this.duration = duration;
    }

    public Certificate(){
        super();
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateName='" + certificateName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
