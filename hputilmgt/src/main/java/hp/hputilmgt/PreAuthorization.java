package hp.hputilmgt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PreAuthorization implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String requestType;
   private java.lang.String trackingNumber;
   private java.lang.String creationDate;
   private java.util.Date createdBy;
   private java.lang.String createdByFacility;
   private java.lang.String phoneNumber;
   private java.lang.String nameForNotification;
   private java.lang.String providerIndUrgency;
   private java.lang.String auditDateREceived;
   private java.lang.String attachmentWithRequest;

   private java.util.List<hp.hputilmgt.question> questions;

   private java.lang.String memberId;

   private java.lang.String coverageType;

   private java.lang.String memberName;

   private java.lang.String patientName;

   private java.lang.String relationShipToMember;

   @org.kie.api.definition.type.Label("age")
   private java.lang.Integer age;

   private java.lang.String isEligible;

   private java.util.List<java.lang.String> reason;

   public PreAuthorization()
   {
   }

   public java.lang.String getRequestType()
   {
      return this.requestType;
   }

   public void setRequestType(java.lang.String requestType)
   {
      this.requestType = requestType;
   }

   public java.lang.String getTrackingNumber()
   {
      return this.trackingNumber;
   }

   public void setTrackingNumber(java.lang.String trackingNumber)
   {
      this.trackingNumber = trackingNumber;
   }

   public java.lang.String getCreationDate()
   {
      return this.creationDate;
   }

   public void setCreationDate(java.lang.String creationDate)
   {
      this.creationDate = creationDate;
   }

   public java.util.Date getCreatedBy()
   {
      return this.createdBy;
   }

   public void setCreatedBy(java.util.Date createdBy)
   {
      this.createdBy = createdBy;
   }

   public java.lang.String getCreatedByFacility()
   {
      return this.createdByFacility;
   }

   public void setCreatedByFacility(java.lang.String createdByFacility)
   {
      this.createdByFacility = createdByFacility;
   }

   public java.lang.String getPhoneNumber()
   {
      return this.phoneNumber;
   }

   public void setPhoneNumber(java.lang.String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   public java.lang.String getNameForNotification()
   {
      return this.nameForNotification;
   }

   public void setNameForNotification(java.lang.String nameForNotification)
   {
      this.nameForNotification = nameForNotification;
   }

   public java.lang.String getProviderIndUrgency()
   {
      return this.providerIndUrgency;
   }

   public void setProviderIndUrgency(java.lang.String providerIndUrgency)
   {
      this.providerIndUrgency = providerIndUrgency;
   }

   public java.lang.String getAuditDateREceived()
   {
      return this.auditDateREceived;
   }

   public void setAuditDateREceived(java.lang.String auditDateREceived)
   {
      this.auditDateREceived = auditDateREceived;
   }

   public java.lang.String getAttachmentWithRequest()
   {
      return this.attachmentWithRequest;
   }

   public void setAttachmentWithRequest(java.lang.String attachmentWithRequest)
   {
      this.attachmentWithRequest = attachmentWithRequest;
   }

   public java.util.List<hp.hputilmgt.question> getQuestions()
   {
      return this.questions;
   }

   public void setQuestions(java.util.List<hp.hputilmgt.question> questions)
   {
      this.questions = questions;
   }

   public java.lang.String getMemberId()
   {
      return this.memberId;
   }

   public void setMemberId(java.lang.String memberId)
   {
      this.memberId = memberId;
   }

   public java.lang.String getCoverageType()
   {
      return this.coverageType;
   }

   public void setCoverageType(java.lang.String coverageType)
   {
      this.coverageType = coverageType;
   }

   public java.lang.String getMemberName()
   {
      return this.memberName;
   }

   public void setMemberName(java.lang.String memberName)
   {
      this.memberName = memberName;
   }

   public java.lang.String getPatientName()
   {
      return this.patientName;
   }

   public void setPatientName(java.lang.String patientName)
   {
      this.patientName = patientName;
   }

   public java.lang.String getRelationShipToMember()
   {
      return this.relationShipToMember;
   }

   public void setRelationShipToMember(java.lang.String relationShipToMember)
   {
      this.relationShipToMember = relationShipToMember;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.String getIsEligible()
   {
      return this.isEligible;
   }

   public void setIsEligible(java.lang.String isEligible)
   {
      this.isEligible = isEligible;
   }

   public java.util.List<java.lang.String> getReason()
   {
      return this.reason;
   }

   public void setReason(java.util.List<java.lang.String> reason)
   {
      this.reason = reason;
   }

   public PreAuthorization(java.lang.String requestType,
         java.lang.String trackingNumber, java.lang.String creationDate,
         java.util.Date createdBy, java.lang.String createdByFacility,
         java.lang.String phoneNumber, java.lang.String nameForNotification,
         java.lang.String providerIndUrgency,
         java.lang.String auditDateREceived,
         java.lang.String attachmentWithRequest,
         java.util.List<hp.hputilmgt.question> questions,
         java.lang.String memberId, java.lang.String coverageType,
         java.lang.String memberName, java.lang.String patientName,
         java.lang.String relationShipToMember, java.lang.Integer age,
         java.lang.String isEligible, java.util.List<java.lang.String> reason)
   {
      this.requestType = requestType;
      this.trackingNumber = trackingNumber;
      this.creationDate = creationDate;
      this.createdBy = createdBy;
      this.createdByFacility = createdByFacility;
      this.phoneNumber = phoneNumber;
      this.nameForNotification = nameForNotification;
      this.providerIndUrgency = providerIndUrgency;
      this.auditDateREceived = auditDateREceived;
      this.attachmentWithRequest = attachmentWithRequest;
      this.questions = questions;
      this.memberId = memberId;
      this.coverageType = coverageType;
      this.memberName = memberName;
      this.patientName = patientName;
      this.relationShipToMember = relationShipToMember;
      this.age = age;
      this.isEligible = isEligible;
      this.reason = reason;
   }

}