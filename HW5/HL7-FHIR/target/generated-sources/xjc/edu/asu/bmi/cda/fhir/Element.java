//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base element used for all FHIR elements and resources - allows for them to be extended with extensions
 * 
 * <p>Java class for Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", propOrder = {
    "extensions"
})
@XmlSeeAlso({
    Extension.class,
    Code.class,
    Narrative.class,
    Identifier.class,
    DateTime.class,
    ResourceReference.class,
    Boolean.class,
    CodeableConcept.class,
    AlertStatus.class,
    edu.asu.bmi.cda.fhir.String.class,
    Criticality.class,
    SensitivityType.class,
    SensitivityStatus.class,
    CarePlanStatus.class,
    Period.class,
    CompositionStatus.class,
    Coding.class,
    Contact.class,
    ValueSetStatus.class,
    Date.class,
    ConditionStatus.class,
    ConformanceStatementStatus.class,
    Id.class,
    Uri.class,
    Instant.class,
    DiagnosticOrderStatus.class,
    DiagnosticOrderPriority.class,
    DiagnosticReportStatus.class,
    Attachment.class,
    DocumentReferenceStatus.class,
    Integer.class,
    EncounterState.class,
    EncounterClass.class,
    GroupType.class,
    Oid.class,
    ImagingModality.class,
    InstanceAvailability.class,
    ListMode.class,
    Address.class,
    LocationStatus.class,
    LocationMode.class,
    MediaType.class,
    MedicationKind.class,
    MedicationAdministrationStatus.class,
    MedicationDispenseStatus.class,
    MedicationPrescriptionStatus.class,
    SampledData.class,
    Ratio.class,
    ObservationStatus.class,
    ObservationReliability.class,
    OrderOutcomeStatus.class,
    HumanName.class,
    ResourceProfileStatus.class,
    QuestionnaireStatus.class,
    SupplyStatus.class,
    ReactionSeverity.class,
    ExposureType.class,
    CausalityExpectation.class,
    CarePlanActivityCategory.class,
    CarePlanGoalStatus.class,
    CarePlanActivityStatus.class,
    CompositionAttestationMode.class,
    ConceptMapEquivalence.class,
    ConditionRelationshipType.class,
    DocumentMode.class,
    RestfulConformanceMode.class,
    ConformanceEventMode.class,
    MessageSignificanceCategory.class,
    RestfulOperationType.class,
    RestfulOperationSystem.class,
    DocumentRelationshipType.class,
    Modality.class,
    ResponseType.class,
    ObservationRelationshipType.class,
    IssueSeverity.class,
    LinkType.class,
    ProcedureRelationshipType.class,
    BindingConformance.class,
    ConstraintSeverity.class,
    PropertyRepresentation.class,
    AggregationMode.class,
    ExtensionContext.class,
    SlicingRules.class,
    ProvenanceEntityRole.class,
    QueryOutcome.class,
    SecurityEventObjectRole.class,
    SecurityEventObjectType.class,
    SecurityEventAction.class,
    SecurityEventObjectLifecycle.class,
    SecurityEventParticipantNetworkType.class,
    SecurityEventOutcome.class,
    HierarchicalRelationshipType.class,
    SupplyDispenseStatus.class,
    FilterOperator.class,
    Decimal.class,
    Base64Binary.class,
    Uuid.class,
    NarrativeStatus.class,
    QuantityRange.class,
    QuantityCompararator.class,
    SampledDataDataType.class,
    IdentifierUse.class,
    Quantity.class,
    Schedule.class,
    ScheduleRepeat.class,
    EventTiming.class,
    UnitsOfTime.class,
    ContactSystem.class,
    ContactUse.class,
    AddressUse.class,
    NameUse.class,
    SearchParamType.class,
    BackboneElement.class
})
public class Element
    implements Serializable
{

    @XmlElement(name = "extension")
    protected List<Extension> extensions;
    @XmlAttribute(name = "id")
    protected java.lang.String id;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    public Element withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    public Element withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    public Element withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
