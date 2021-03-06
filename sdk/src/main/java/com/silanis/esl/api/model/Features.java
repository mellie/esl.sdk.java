package com.silanis.esl.api.model;
//
import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.ArrayList;
import com.silanis.esl.api.util.SchemaSanitizer;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Features extends Model
      implements java.io.Serializable
{
    
    // Dirty Flag Constants
    @JsonIgnore
    public static final String FIELD_ATTACHMENTS = "attachments";
    @JsonIgnore
    public static final String FIELD_CUSTOMFIELDS = "customFields";
    @JsonIgnore
    public static final String FIELD_ENCRYPTDOCUMENTS = "encryptDocuments";
    @JsonIgnore
    public static final String FIELD_EVIDENCESUMMARY = "evidenceSummary";
    @JsonIgnore
    public static final String FIELD_FASTTRACK = "fastTrack";
    @JsonIgnore
    public static final String FIELD_FORCELOGIN = "forceLogin";
    @JsonIgnore
    public static final String FIELD_GROUPS = "groups";
    @JsonIgnore
    public static final String FIELD_TAMPERSEALEVIDENCE = "tamperSealEvidence";
    
    // Empty Constructor
    public Features ( ) {}
    
    // Fields
    protected Boolean _attachments = false;
    protected Boolean _customFields = false;
    protected Boolean _encryptDocuments = false;
    protected Boolean _evidenceSummary = false;
    protected Boolean _fastTrack = false;
    protected Boolean _forceLogin = false;
    protected Boolean _groups = false;
    protected Boolean _tamperSealEvidence = false;
    
    // Accessors
        
    
    public Features setAttachments( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_ATTACHMENTS,value);
        // TODO With proper compare
        // if ( this._attachments == value ) return this;
        this._attachments = value;
        setDirty(FIELD_ATTACHMENTS);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetAttachments( Boolean value ){
        if ( value != null ) { this.setAttachments( value ); }
        return this;
    }
    public Boolean getAttachments(){
        return _attachments;
    }
    @JsonIgnore
    public boolean evalAttachments(){
        return _attachments == null ? false : _attachments.booleanValue();
    }
    
        
    
    public Features setCustomFields( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_CUSTOMFIELDS,value);
        // TODO With proper compare
        // if ( this._customFields == value ) return this;
        this._customFields = value;
        setDirty(FIELD_CUSTOMFIELDS);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetCustomFields( Boolean value ){
        if ( value != null ) { this.setCustomFields( value ); }
        return this;
    }
    public Boolean getCustomFields(){
        return _customFields;
    }
    @JsonIgnore
    public boolean evalCustomFields(){
        return _customFields == null ? false : _customFields.booleanValue();
    }
    
        
    
    public Features setEncryptDocuments( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_ENCRYPTDOCUMENTS,value);
        // TODO With proper compare
        // if ( this._encryptDocuments == value ) return this;
        this._encryptDocuments = value;
        setDirty(FIELD_ENCRYPTDOCUMENTS);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetEncryptDocuments( Boolean value ){
        if ( value != null ) { this.setEncryptDocuments( value ); }
        return this;
    }
    public Boolean getEncryptDocuments(){
        return _encryptDocuments;
    }
    @JsonIgnore
    public boolean evalEncryptDocuments(){
        return _encryptDocuments == null ? false : _encryptDocuments.booleanValue();
    }
    
        
    
    public Features setEvidenceSummary( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_EVIDENCESUMMARY,value);
        // TODO With proper compare
        // if ( this._evidenceSummary == value ) return this;
        this._evidenceSummary = value;
        setDirty(FIELD_EVIDENCESUMMARY);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetEvidenceSummary( Boolean value ){
        if ( value != null ) { this.setEvidenceSummary( value ); }
        return this;
    }
    public Boolean getEvidenceSummary(){
        return _evidenceSummary;
    }
    @JsonIgnore
    public boolean evalEvidenceSummary(){
        return _evidenceSummary == null ? false : _evidenceSummary.booleanValue();
    }
    
        
    
    public Features setFastTrack( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_FASTTRACK,value);
        // TODO With proper compare
        // if ( this._fastTrack == value ) return this;
        this._fastTrack = value;
        setDirty(FIELD_FASTTRACK);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetFastTrack( Boolean value ){
        if ( value != null ) { this.setFastTrack( value ); }
        return this;
    }
    public Boolean getFastTrack(){
        return _fastTrack;
    }
    @JsonIgnore
    public boolean evalFastTrack(){
        return _fastTrack == null ? false : _fastTrack.booleanValue();
    }
    
        
    
    public Features setForceLogin( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_FORCELOGIN,value);
        // TODO With proper compare
        // if ( this._forceLogin == value ) return this;
        this._forceLogin = value;
        setDirty(FIELD_FORCELOGIN);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetForceLogin( Boolean value ){
        if ( value != null ) { this.setForceLogin( value ); }
        return this;
    }
    public Boolean getForceLogin(){
        return _forceLogin;
    }
    @JsonIgnore
    public boolean evalForceLogin(){
        return _forceLogin == null ? false : _forceLogin.booleanValue();
    }
    
        
    
    public Features setGroups( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_GROUPS,value);
        // TODO With proper compare
        // if ( this._groups == value ) return this;
        this._groups = value;
        setDirty(FIELD_GROUPS);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetGroups( Boolean value ){
        if ( value != null ) { this.setGroups( value ); }
        return this;
    }
    public Boolean getGroups(){
        return _groups;
    }
    @JsonIgnore
    public boolean evalGroups(){
        return _groups == null ? false : _groups.booleanValue();
    }
    
        
    
    public Features setTamperSealEvidence( Boolean value ){
        SchemaSanitizer.throwOnNull(FIELD_TAMPERSEALEVIDENCE,value);
        // TODO With proper compare
        // if ( this._tamperSealEvidence == value ) return this;
        this._tamperSealEvidence = value;
        setDirty(FIELD_TAMPERSEALEVIDENCE);
        return this;
    }
    // Used internally by aws. Invokes a the corresponding setter if the value is not null
    @JsonIgnore
    public Features safeSetTamperSealEvidence( Boolean value ){
        if ( value != null ) { this.setTamperSealEvidence( value ); }
        return this;
    }
    public Boolean getTamperSealEvidence(){
        return _tamperSealEvidence;
    }
    @JsonIgnore
    public boolean evalTamperSealEvidence(){
        return _tamperSealEvidence == null ? false : _tamperSealEvidence.booleanValue();
    }
    
    
}