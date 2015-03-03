//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An element defined in a FHIR resources - can have modifierExtension elements
 * 
 * <p>Java class for BackboneElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackboneElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackboneElement", propOrder = {
    "modifierExtensions"
})
@XmlSeeAlso({
    AdverseReactionSymptom.class,
    AdverseReactionExposure.class,
    CarePlanParticipant.class,
    CarePlanGoal.class,
    CarePlanActivity.class,
    CompositionAttester.class,
    CompositionEvent.class,
    CompositionSection.class,
    ConceptMapConcept.class,
    ConditionStage.class,
    ConditionEvidence.class,
    ConditionLocation.class,
    ConditionRelatedItem.class,
    ConformanceSoftware.class,
    ConformanceImplementation.class,
    ConformanceRest.class,
    ConformanceMessaging.class,
    ConformanceDocument.class,
    DeviceObservationReportVirtualDevice.class,
    DiagnosticOrderEvent.class,
    DiagnosticOrderItem.class,
    DiagnosticReportImage.class,
    DocumentReferenceRelatesTo.class,
    DocumentReferenceService.class,
    DocumentReferenceContext.class,
    EncounterParticipant.class,
    EncounterHospitalization.class,
    EncounterLocation.class,
    FamilyHistoryRelation.class,
    GroupCharacteristic.class,
    ImagingStudySeries.class,
    ImmunizationExplanation.class,
    ImmunizationReaction.class,
    ImmunizationVaccinationProtocol.class,
    ImmunizationRecommendationRecommendation.class,
    ListEntry.class,
    LocationPosition.class,
    MedicationProduct.class,
    MedicationPackage.class,
    MedicationAdministrationDosage.class,
    MedicationDispenseDispense.class,
    MedicationDispenseSubstitution.class,
    MedicationPrescriptionDosageInstruction.class,
    MedicationPrescriptionDispense.class,
    MedicationPrescriptionSubstitution.class,
    MedicationStatementDosage.class,
    MessageHeaderResponse.class,
    MessageHeaderSource.class,
    MessageHeaderDestination.class,
    ObservationReferenceRange.class,
    ObservationRelated.class,
    OperationOutcomeIssue.class,
    OrderWhen.class,
    OrganizationContact.class,
    PatientContact.class,
    PatientAnimal.class,
    PatientLink.class,
    PractitionerQualification.class,
    ProcedurePerformer.class,
    ProcedureRelatedItem.class,
    ProfileMapping.class,
    ProfileStructure.class,
    ProfileExtensionDefn.class,
    ProfileQuery.class,
    ProvenanceAgent.class,
    ProvenanceEntity.class,
    QueryResponse.class,
    QuestionnaireGroup.class,
    SecurityEventEvent.class,
    SecurityEventParticipant.class,
    SecurityEventSource.class,
    SecurityEventObject.class,
    SpecimenSource.class,
    SpecimenCollection.class,
    SpecimenTreatment.class,
    SpecimenContainer.class,
    SubstanceInstance.class,
    SubstanceIngredient.class,
    SupplyDispense.class,
    ValueSetDefine.class,
    ValueSetCompose.class,
    ValueSetExpansion.class,
    CarePlanSimple.class,
    ConceptMapDependsOn.class,
    ConceptMapMap.class,
    ConformanceSecurity.class,
    ConformanceCertificate.class,
    ConformanceResource.class,
    ConformanceOperation.class,
    ConformanceSearchParam.class,
    ConformanceOperation1 .class,
    ConformanceQuery.class,
    ConformanceEvent.class,
    DeviceObservationReportChannel.class,
    DeviceObservationReportMetric.class,
    DocumentReferenceParameter.class,
    EncounterAccomodation.class,
    FamilyHistoryCondition.class,
    ImagingStudyInstance.class,
    ImmunizationRecommendationDateCriterion.class,
    ImmunizationRecommendationProtocol.class,
    MedicationIngredient.class,
    MedicationContent.class,
    MedicationDispenseDosage.class,
    ProfileElement.class,
    ProfileSlicing.class,
    ProfileDefinition.class,
    ProfileType.class,
    ProfileConstraint.class,
    ProfileBinding.class,
    ProfileMapping1 .class,
    ProfileSearchParam.class,
    QuestionnaireQuestion.class,
    SecurityEventNetwork.class,
    SecurityEventDetail.class,
    ValueSetConcept.class,
    ValueSetInclude.class,
    ValueSetFilter.class,
    ValueSetContains.class,
    Resource.class
})
public class BackboneElement
    extends Element
    implements Serializable
{

    @XmlElement(name = "modifierExtension")
    protected List<Extension> modifierExtensions;

    /**
     * Gets the value of the modifierExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getModifierExtensions() {
        if (modifierExtensions == null) {
            modifierExtensions = new ArrayList<Extension>();
        }
        return this.modifierExtensions;
    }

    public BackboneElement withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    public BackboneElement withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public BackboneElement withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public BackboneElement withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public BackboneElement withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
