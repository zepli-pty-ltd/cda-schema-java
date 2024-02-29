//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.ci.cda.extensions._3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.cda._2_0.AD;
import au.net.electronichealth.ns.cda._2_0.BL;
import au.net.electronichealth.ns.cda._2_0.CD;
import au.net.electronichealth.ns.cda._2_0.CE;
import au.net.electronichealth.ns.cda._2_0.INT;
import au.net.electronichealth.ns.cda._2_0.ON;
import au.net.electronichealth.ns.cda._2_0.POCDMT000040Patient;
import au.net.electronichealth.ns.cda._2_0.ST;
import au.net.electronichealth.ns.cda._2_0.TEL;
import au.net.electronichealth.ns.cda._2_0.TS;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.ci.cda.extensions._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AsEntityIdentifier_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asEntityIdentifier");
    private final static QName _AsOrganizationPartOf_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asOrganizationPartOf");
    private final static QName _SubjectOf2_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "subjectOf2");
    private final static QName _SubjectOf1_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "subjectOf1");
    private final static QName _Coverage_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "coverage");
    private final static QName _AsQualifications_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asQualifications");
    private final static QName _DeceasedTime_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "deceasedTime");
    private final static QName _MultipleBirthOrderNumber_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "multipleBirthOrderNumber");
    private final static QName _FormCode_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "formCode");
    private final static QName _AsIngredient_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asIngredient");
    private final static QName _AsSpecimenInContainer_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asSpecimenInContainer");
    private final static QName _CompletionCode_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "completionCode");
    private final static QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "name");
    private final static QName _Desc_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "desc");
    private final static QName _Code_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "code");
    private final static QName _MultipleBirthInd_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "multipleBirthInd");
    private final static QName _BirthTime_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "birthTime");
    private final static QName _PersonalRelationship_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "personalRelationship");
    private final static QName _ControlAct_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "controlAct");
    private final static QName _MethodCode_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "methodCode");
    private final static QName _AdministrativeGenderCode_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "administrativeGenderCode");
    private final static QName _Coverage2_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "coverage2");
    private final static QName _AsEmployment_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asEmployment");
    private final static QName _Telecom_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "telecom");
    private final static QName _DeceasedInd_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "deceasedInd");
    private final static QName _Addr_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "addr");
    private final static QName _PersonalRelationshipAsPersonalRelationship_QNAME = new QName("http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", "asPersonalRelationship");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.ci.cda.extensions._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ControlAct }
     * 
     */
    public ControlAct createControlAct() {
        return new ControlAct();
    }

    /**
     * Create an instance of {@link PersonalRelationship }
     * 
     */
    public PersonalRelationship createPersonalRelationship() {
        return new PersonalRelationship();
    }

    /**
     * Create an instance of {@link Coverage2 }
     * 
     */
    public Coverage2 createCoverage2() {
        return new Coverage2();
    }

    /**
     * Create an instance of {@link Employment }
     * 
     */
    public Employment createEmployment() {
        return new Employment();
    }

    /**
     * Create an instance of {@link Subject1 }
     * 
     */
    public Subject1 createSubject1() {
        return new Subject1();
    }

    /**
     * Create an instance of {@link Coverage }
     * 
     */
    public Coverage createCoverage() {
        return new Coverage();
    }

    /**
     * Create an instance of {@link Subject2 }
     * 
     */
    public Subject2 createSubject2() {
        return new Subject2();
    }

    /**
     * Create an instance of {@link EntityIdentifier }
     * 
     */
    public EntityIdentifier createEntityIdentifier() {
        return new EntityIdentifier();
    }

    /**
     * Create an instance of {@link OrganizationPartOf }
     * 
     */
    public OrganizationPartOf createOrganizationPartOf() {
        return new OrganizationPartOf();
    }

    /**
     * Create an instance of {@link Qualifications }
     * 
     */
    public Qualifications createQualifications() {
        return new Qualifications();
    }

    /**
     * Create an instance of {@link SpecimenInContainer }
     * 
     */
    public SpecimenInContainer createSpecimenInContainer() {
        return new SpecimenInContainer();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link SubstitutionPermission }
     * 
     */
    public SubstitutionPermission createSubstitutionPermission() {
        return new SubstitutionPermission();
    }

    /**
     * Create an instance of {@link GeographicArea }
     * 
     */
    public GeographicArea createGeographicArea() {
        return new GeographicArea();
    }

    /**
     * Create an instance of {@link PolicyOrAccount }
     * 
     */
    public PolicyOrAccount createPolicyOrAccount() {
        return new PolicyOrAccount();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link ManufacturedMaterial }
     * 
     */
    public ManufacturedMaterial createManufacturedMaterial() {
        return new ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link Participant }
     * 
     */
    public Participant createParticipant() {
        return new Participant();
    }

    /**
     * Create an instance of {@link TypeId }
     * 
     */
    public TypeId createTypeId() {
        return new TypeId();
    }

    /**
     * Create an instance of {@link Entitlement }
     * 
     */
    public Entitlement createEntitlement() {
        return new Entitlement();
    }

    /**
     * Create an instance of {@link FieldOfPractice }
     * 
     */
    public FieldOfPractice createFieldOfPractice() {
        return new FieldOfPractice();
    }

    /**
     * Create an instance of {@link ParticipantRole }
     * 
     */
    public ParticipantRole createParticipantRole() {
        return new ParticipantRole();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asEntityIdentifier")
    public JAXBElement<EntityIdentifier> createAsEntityIdentifier(EntityIdentifier value) {
        return new JAXBElement<EntityIdentifier>(_AsEntityIdentifier_QNAME, EntityIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPartOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asOrganizationPartOf")
    public JAXBElement<OrganizationPartOf> createAsOrganizationPartOf(OrganizationPartOf value) {
        return new JAXBElement<OrganizationPartOf>(_AsOrganizationPartOf_QNAME, OrganizationPartOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "subjectOf2")
    public JAXBElement<Subject2> createSubjectOf2(Subject2 value) {
        return new JAXBElement<Subject2>(_SubjectOf2_QNAME, Subject2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "subjectOf1")
    public JAXBElement<Subject1> createSubjectOf1(Subject1 value) {
        return new JAXBElement<Subject1>(_SubjectOf1_QNAME, Subject1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "coverage")
    public JAXBElement<Coverage> createCoverage(Coverage value) {
        return new JAXBElement<Coverage>(_Coverage_QNAME, Coverage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qualifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asQualifications")
    public JAXBElement<Qualifications> createAsQualifications(Qualifications value) {
        return new JAXBElement<Qualifications>(_AsQualifications_QNAME, Qualifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "deceasedTime")
    public JAXBElement<TS> createDeceasedTime(TS value) {
        return new JAXBElement<TS>(_DeceasedTime_QNAME, TS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "multipleBirthOrderNumber")
    public JAXBElement<INT> createMultipleBirthOrderNumber(INT value) {
        return new JAXBElement<INT>(_MultipleBirthOrderNumber_QNAME, INT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "formCode")
    public JAXBElement<CD> createFormCode(CD value) {
        return new JAXBElement<CD>(_FormCode_QNAME, CD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asIngredient")
    public JAXBElement<Ingredient> createAsIngredient(Ingredient value) {
        return new JAXBElement<Ingredient>(_AsIngredient_QNAME, Ingredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecimenInContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asSpecimenInContainer")
    public JAXBElement<SpecimenInContainer> createAsSpecimenInContainer(SpecimenInContainer value) {
        return new JAXBElement<SpecimenInContainer>(_AsSpecimenInContainer_QNAME, SpecimenInContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "completionCode")
    public JAXBElement<CE> createCompletionCode(CE value) {
        return new JAXBElement<CE>(_CompletionCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "name")
    public JAXBElement<ON> createName(ON value) {
        return new JAXBElement<ON>(_Name_QNAME, ON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "desc")
    public JAXBElement<ST> createDesc(ST value) {
        return new JAXBElement<ST>(_Desc_QNAME, ST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "code")
    public JAXBElement<CE> createCode(CE value) {
        return new JAXBElement<CE>(_Code_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "multipleBirthInd")
    public JAXBElement<BL> createMultipleBirthInd(BL value) {
        return new JAXBElement<BL>(_MultipleBirthInd_QNAME, BL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "birthTime")
    public JAXBElement<TS> createBirthTime(TS value) {
        return new JAXBElement<TS>(_BirthTime_QNAME, TS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "personalRelationship")
    public JAXBElement<PersonalRelationship> createPersonalRelationship(PersonalRelationship value) {
        return new JAXBElement<PersonalRelationship>(_PersonalRelationship_QNAME, PersonalRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "controlAct")
    public JAXBElement<ControlAct> createControlAct(ControlAct value) {
        return new JAXBElement<ControlAct>(_ControlAct_QNAME, ControlAct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "methodCode")
    public JAXBElement<CD> createMethodCode(CD value) {
        return new JAXBElement<CD>(_MethodCode_QNAME, CD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "administrativeGenderCode")
    public JAXBElement<CE> createAdministrativeGenderCode(CE value) {
        return new JAXBElement<CE>(_AdministrativeGenderCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "coverage2")
    public JAXBElement<Coverage2> createCoverage2(Coverage2 value) {
        return new JAXBElement<Coverage2>(_Coverage2_QNAME, Coverage2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asEmployment")
    public JAXBElement<Employment> createAsEmployment(Employment value) {
        return new JAXBElement<Employment>(_AsEmployment_QNAME, Employment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "telecom")
    public JAXBElement<TEL> createTelecom(TEL value) {
        return new JAXBElement<TEL>(_Telecom_QNAME, TEL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "deceasedInd")
    public JAXBElement<BL> createDeceasedInd(BL value) {
        return new JAXBElement<BL>(_DeceasedInd_QNAME, BL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "addr")
    public JAXBElement<AD> createAddr(AD value) {
        return new JAXBElement<AD>(_Addr_QNAME, AD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0", name = "asPersonalRelationship", scope = PersonalRelationship.class)
    public JAXBElement<POCDMT000040Patient> createPersonalRelationshipAsPersonalRelationship(POCDMT000040Patient value) {
        return new JAXBElement<POCDMT000040Patient>(_PersonalRelationshipAsPersonalRelationship_QNAME, POCDMT000040Patient.class, PersonalRelationship.class, value);
    }

}
