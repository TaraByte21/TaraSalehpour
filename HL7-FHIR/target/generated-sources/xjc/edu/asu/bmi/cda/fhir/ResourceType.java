//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ResourceType.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ResourceType.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Provenance"/&gt;
 *     &lt;enumeration value="Condition"/&gt;
 *     &lt;enumeration value="CarePlan"/&gt;
 *     &lt;enumeration value="Supply"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *     &lt;enumeration value="Query"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="Organization"/&gt;
 *     &lt;enumeration value="Procedure"/&gt;
 *     &lt;enumeration value="Substance"/&gt;
 *     &lt;enumeration value="DiagnosticReport"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="ValueSet"/&gt;
 *     &lt;enumeration value="Medication"/&gt;
 *     &lt;enumeration value="MessageHeader"/&gt;
 *     &lt;enumeration value="ImmunizationRecommendation"/&gt;
 *     &lt;enumeration value="DocumentManifest"/&gt;
 *     &lt;enumeration value="MedicationDispense"/&gt;
 *     &lt;enumeration value="MedicationPrescription"/&gt;
 *     &lt;enumeration value="MedicationAdministration"/&gt;
 *     &lt;enumeration value="Encounter"/&gt;
 *     &lt;enumeration value="SecurityEvent"/&gt;
 *     &lt;enumeration value="MedicationStatement"/&gt;
 *     &lt;enumeration value="List"/&gt;
 *     &lt;enumeration value="Questionnaire"/&gt;
 *     &lt;enumeration value="Composition"/&gt;
 *     &lt;enumeration value="DeviceObservationReport"/&gt;
 *     &lt;enumeration value="OperationOutcome"/&gt;
 *     &lt;enumeration value="Conformance"/&gt;
 *     &lt;enumeration value="Media"/&gt;
 *     &lt;enumeration value="FamilyHistory"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Profile"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *     &lt;enumeration value="Observation"/&gt;
 *     &lt;enumeration value="AllergyIntolerance"/&gt;
 *     &lt;enumeration value="DocumentReference"/&gt;
 *     &lt;enumeration value="Immunization"/&gt;
 *     &lt;enumeration value="RelatedPerson"/&gt;
 *     &lt;enumeration value="Specimen"/&gt;
 *     &lt;enumeration value="OrderResponse"/&gt;
 *     &lt;enumeration value="Alert"/&gt;
 *     &lt;enumeration value="ConceptMap"/&gt;
 *     &lt;enumeration value="Patient"/&gt;
 *     &lt;enumeration value="Practitioner"/&gt;
 *     &lt;enumeration value="AdverseReaction"/&gt;
 *     &lt;enumeration value="ImagingStudy"/&gt;
 *     &lt;enumeration value="DiagnosticOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceType")
@XmlEnum
public enum ResourceType {


    /**
     * Provenance information that describes the activity that led to the creation of a set of resources. This information can be used to help determine their reliability or trace where the information in them came from. The focus of the provenance resource is record keeping, audit and traceability, and not explicit statements of clinical significance.
     * 
     */
    @XmlEnumValue("Provenance")
    PROVENANCE("Provenance"),

    /**
     * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a Diagnosis during an Encounter; populating a problem List or a Summary Statement, such as a Discharge Summary.
     * 
     */
    @XmlEnumValue("Condition")
    CONDITION("Condition"),

    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
     * 
     */
    @XmlEnumValue("CarePlan")
    CARE_PLAN("CarePlan"),

    /**
     * A supply - a  request for something, and provision of what is supplied.
     * 
     */
    @XmlEnumValue("Supply")
    SUPPLY("Supply"),

    /**
     * This resource identifies an instance of a manufactured thing that is used in the provision of healthcare without being substantially changed through that activity. The device may be a machine, an insert, a computer, an application, etc. This includes durable (reusable) medical equipment as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.
     * 
     */
    @XmlEnumValue("Device")
    DEVICE("Device"),

    /**
     * A description of a query with a set of parameters.
     * 
     */
    @XmlEnumValue("Query")
    QUERY("Query"),

    /**
     * A request to perform an action.
     * 
     */
    @XmlEnumValue("Order")
    ORDER("Order"),

    /**
     * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
     * 
     */
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),

    /**
     * An action that is performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
     * 
     */
    @XmlEnumValue("Procedure")
    PROCEDURE("Procedure"),

    /**
     * A homogeneous material with a definite composition.
     * 
     */
    @XmlEnumValue("Substance")
    SUBSTANCE("Substance"),

    /**
     * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretation, and formatted representation of diagnostic reports.
     * 
     */
    @XmlEnumValue("DiagnosticReport")
    DIAGNOSTIC_REPORT("DiagnosticReport"),

    /**
     * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized.  I.e. A collection of entities that isn't an Organization.
     * 
     */
    @XmlEnumValue("Group")
    GROUP("Group"),

    /**
     * A value set specifies a set of codes drawn from one or more code systems.
     * 
     */
    @XmlEnumValue("ValueSet")
    VALUE_SET("ValueSet"),

    /**
     * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
     * 
     */
    @XmlEnumValue("Medication")
    MEDICATION("Medication"),

    /**
     * The header for a message exchange that is either requesting or responding to an action.  The resource(s) that are the subject of the action as well as other Information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     * 
     */
    @XmlEnumValue("MessageHeader")
    MESSAGE_HEADER("MessageHeader"),

    /**
     * A patient's point-of-time immunization status and recommendation with optional supporting justification.
     * 
     */
    @XmlEnumValue("ImmunizationRecommendation")
    IMMUNIZATION_RECOMMENDATION("ImmunizationRecommendation"),

    /**
     * A manifest that defines a set of documents.
     * 
     */
    @XmlEnumValue("DocumentManifest")
    DOCUMENT_MANIFEST("DocumentManifest"),

    /**
     * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
     * 
     */
    @XmlEnumValue("MedicationDispense")
    MEDICATION_DISPENSE("MedicationDispense"),

    /**
     * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
     * 
     */
    @XmlEnumValue("MedicationPrescription")
    MEDICATION_PRESCRIPTION("MedicationPrescription"),

    /**
     * Describes the event of a patient being given a dose of a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.
     * 
     * Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     * 
     */
    @XmlEnumValue("MedicationAdministration")
    MEDICATION_ADMINISTRATION("MedicationAdministration"),

    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     * 
     */
    @XmlEnumValue("Encounter")
    ENCOUNTER("Encounter"),

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     * 
     */
    @XmlEnumValue("SecurityEvent")
    SECURITY_EVENT("SecurityEvent"),

    /**
     * A record of medication being taken by a patient, or that the medication has been given to a patient where the record is the result of a report from the patient or another clinician.
     * 
     */
    @XmlEnumValue("MedicationStatement")
    MEDICATION_STATEMENT("MedicationStatement"),

    /**
     * A set of information summarized from a list of other resources.
     * 
     */
    @XmlEnumValue("List")
    LIST("List"),

    /**
     * A structured set of questions and their answers. The Questionnaire may contain questions, answers or both. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
     * 
     */
    @XmlEnumValue("Questionnaire")
    QUESTIONNAIRE("Questionnaire"),

    /**
     * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
     * 
     */
    @XmlEnumValue("Composition")
    COMPOSITION("Composition"),

    /**
     * Describes the data produced by a device at a point in time.
     * 
     */
    @XmlEnumValue("DeviceObservationReport")
    DEVICE_OBSERVATION_REPORT("DeviceObservationReport"),

    /**
     * A collection of error, warning or information messages that result from a system action.
     * 
     */
    @XmlEnumValue("OperationOutcome")
    OPERATION_OUTCOME("OperationOutcome"),

    /**
     * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
     * 
     */
    @XmlEnumValue("Conformance")
    CONFORMANCE("Conformance"),

    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
     * 
     */
    @XmlEnumValue("Media")
    MEDIA("Media"),

    /**
     * Significant health events and conditions for people related to the subject relevant in the context of care for the subject.
     * 
     */
    @XmlEnumValue("FamilyHistory")
    FAMILY_HISTORY("FamilyHistory"),

    /**
     * Other is a conformant for handling resource concepts not yet defined for FHIR or outside HL7's scope of interest.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
     * 
     */
    @XmlEnumValue("Profile")
    PROFILE("Profile"),

    /**
     * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
     * 
     */
    @XmlEnumValue("Location")
    LOCATION("Location"),

    /**
     * Measurements and simple assertions made about a patient, device or other subject.
     * 
     */
    @XmlEnumValue("Observation")
    OBSERVATION("Observation"),

    /**
     * Indicates the patient has a susceptibility to an adverse reaction upon exposure to a specified substance.
     * 
     */
    @XmlEnumValue("AllergyIntolerance")
    ALLERGY_INTOLERANCE("AllergyIntolerance"),

    /**
     * A reference to a document.
     * 
     */
    @XmlEnumValue("DocumentReference")
    DOCUMENT_REFERENCE("DocumentReference"),

    /**
     * Immunization event information.
     * 
     */
    @XmlEnumValue("Immunization")
    IMMUNIZATION("Immunization"),

    /**
     * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
     * 
     */
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),

    /**
     * Sample for analysis.
     * 
     */
    @XmlEnumValue("Specimen")
    SPECIMEN("Specimen"),

    /**
     * A response to an order.
     * 
     */
    @XmlEnumValue("OrderResponse")
    ORDER_RESPONSE("OrderResponse"),

    /**
     * Prospective warnings of potential issues when providing care to the patient.
     * 
     */
    @XmlEnumValue("Alert")
    ALERT("Alert"),

    /**
     * A statement of relationships from one set of concepts to one or more other concept systems.
     * 
     */
    @XmlEnumValue("ConceptMap")
    CONCEPT_MAP("ConceptMap"),

    /**
     * Demographics and other administrative information about a person or animal receiving care or other health-related services.
     * 
     */
    @XmlEnumValue("Patient")
    PATIENT("Patient"),

    /**
     * A person who is directly or indirectly involved in the provisioning of healthcare.
     * 
     */
    @XmlEnumValue("Practitioner")
    PRACTITIONER("Practitioner"),

    /**
     * Records an unexpected reaction suspected to be related to the exposure of the reaction subject to a substance.
     * 
     */
    @XmlEnumValue("AdverseReaction")
    ADVERSE_REACTION("AdverseReaction"),

    /**
     * Manifest of a set of images produced in study. The set of images may include every image in the study, or it may be an incomplete sample, such as a list of key images.
     * 
     */
    @XmlEnumValue("ImagingStudy")
    IMAGING_STUDY("ImagingStudy"),

    /**
     * A request for a diagnostic investigation service to be performed.
     * 
     */
    @XmlEnumValue("DiagnosticOrder")
    DIAGNOSTIC_ORDER("DiagnosticOrder");
    private final java.lang.String value;

    ResourceType(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResourceType fromValue(java.lang.String v) {
        for (ResourceType c: ResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
