Generating classes from XSD files
---------------------------------
Note: this did not work reliably, but below is what worked at one stage.



-- Steps --
-----------

Set up path to xjc.exe:

set java_path="C:\Program Files\Java\jdk1.8.0_271\bin"

Successful XJC command:

%java_path%\xjc datatypes-base-V3_0.xsd datatypes-V3_0.xsd voc-V3_0.xsd NarrativeBlock.xsd POCD_MT000040-AU-V1_0.xsd CDA-AU-V1_0.xsd -b ..\..\binding\cdaSuperSchemaJaxbBindings.xml

Note that this omitted EXTENSION.xsd, which caused all sorts of problems with the HL7 namespace.

The xsd files were in a xsd_java_mods folder and the other folders were created there. The binding file allowed creation of classes without clashing names.





This gave files in a "generated" folder (705 items)
as well as files in au\net\electronichealth\ns\cda\_2_0 (818 items)
and au\net\electronichealth\ns\ci\cda\extensions\_3 (26 items)

The only ones we retained were the ones in the au.net.electronichealth.ns package structure.

Due to a change in JAXB, in ED.java you need to change:
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
                   --------
to
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

This is why jaxb-impl.jar and jaxb-api.jar are dependencies in the Maven POM.

Ant-based builds avoid this problem (apparently), but running the Java xjc utility from the command line generates the reference to the internal class.

