package com.silanis.esl.api.model;
//
import java.util.List;
import java.util.Map;

public interface IBasePackage extends IEntity{
    public IBasePackage setAutocomplete( Boolean value);
    public Boolean getAutocomplete();
    public IBasePackage setConsent( String value);
    public String getConsent();
    public IBasePackage setData( Map<String, Object> value);
    public Map<String, Object> getData();
    public IBasePackage setDescription( String value);
    public String getDescription();
    public IBasePackage setDocuments( List<Document> value);
    public List<Document> getDocuments();
    public IBasePackage setDue( java.util.Date value);
    public java.util.Date getDue();
    public IBasePackage setEmailMessage( String value);
    public String getEmailMessage();
    public IBasePackage setId( String value);
    public String getId();
    public IBasePackage setLanguage( String value);
    public String getLanguage();
    public IBasePackage setLimits( PackageArtifactsLimits value);
    public PackageArtifactsLimits getLimits();
    public IBasePackage setMessages( List<Message> value);
    public List<Message> getMessages();
    public IBasePackage setName( String value);
    public String getName();
    public IBasePackage setRoles( List<Role> value);
    public List<Role> getRoles();
    public IBasePackage setSender( Sender value);
    public Sender getSender();
    public IBasePackage setSettings( PackageSettings value);
    public PackageSettings getSettings();
    public IBasePackage setSignedDocumentDelivery( SignedDocumentDelivery value);
    public SignedDocumentDelivery getSignedDocumentDelivery();
    public IBasePackage setStatus( PackageStatus value);
    public PackageStatus getStatus();
    public IBasePackage setType( BasePackageType value);
    public BasePackageType getType();
    public IBasePackage setUpdated( java.util.Date value);
    public java.util.Date getUpdated();
    }