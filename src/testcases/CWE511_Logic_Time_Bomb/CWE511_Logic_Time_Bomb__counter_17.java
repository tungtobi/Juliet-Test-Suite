/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE511_Logic_Time_Bomb__counter_17.java
Label Definition File: CWE511_Logic_Time_Bomb.label.xml
Template File: point-flaw-17.tmpl.java
*/
/*
* @description
* CWE: 511 Logic Time Bomb
* Sinks: counter
*    GoodSink: If counter reaches a certain value, print to the console
*    BadSink : If counter reaches a certain value, launch an executable
* Flow Variant: 17 Control flow: for loops
*
* */

package testcases.CWE511_Logic_Time_Bomb;

import testcasesupport.*;

public class CWE511_Logic_Time_Bomb__counter_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            int count = 0;
            do
            {
                /* FLAW: counter triggered backdoor */
                if (count == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);
        }
    }

    /* good1() use the GoodSinkBody in the for statement */
    private void good1() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            int count = 0;
            do
            {
                /* FIX: no backdoor exists */
                if (count == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);
        }
    }

    public void good() throws Throwable
    {
        good1();
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
