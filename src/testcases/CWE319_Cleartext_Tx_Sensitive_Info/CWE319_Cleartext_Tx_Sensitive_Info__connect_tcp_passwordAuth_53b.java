/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_53b.java
Label Definition File: CWE319_Cleartext_Tx_Sensitive_Info.label.xml
Template File: sources-sinks-53b.tmpl.java
*/
/*
 * @description
 * CWE: 319 Cleartext Transmission of Sensitive Information
 * BadSource: connect_tcp Read password using an outbound tcp connection
 * GoodSource: Set password to a hardcoded value (one that was not sent over the network)
 * Sinks: passwordAuth
 *    GoodSink: Decrypt password before using in PasswordAuthentication()
 *    BadSink : Use password directly in PasswordAuthentication()
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package testcases.CWE319_Cleartext_Tx_Sensitive_Info;

import testcasesupport.*;

public class CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_53b
{
    public void badSink(String password ) throws Throwable
    {
        (new CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_53c()).badSink(password );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String password ) throws Throwable
    {
        (new CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_53c()).goodG2BSink(password );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String password ) throws Throwable
    {
        (new CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_53c()).goodB2GSink(password );
    }
}
