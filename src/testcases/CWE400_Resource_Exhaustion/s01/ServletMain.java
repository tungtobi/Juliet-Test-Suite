package testcases.CWE400_Resource_Exhaustion.s01;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGetCWE1(request, response);
		doGetCWE2(request, response);
		doGetCWE3(request, response);
		doGetCWE4(request, response);
		doGetCWE5(request, response);
		doGetCWE6(request, response);
		doGetCWE7(request, response);
		doGetCWE8(request, response);
		doGetCWE9(request, response);
	}
	
	private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */

			/* END-AUTOGENERATED-SERVLET-TESTS-1 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

			/* END-AUTOGENERATED-SERVLET-TESTS-2 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

			/* END-AUTOGENERATED-SERVLET-TESTS-3 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_16()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_16()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_16()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_42()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_09()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_61a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_03()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_54a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_01()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_08()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_07()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_75a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_12()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_11()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_16()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_71a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_14()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_17()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_73a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_15()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_72a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_41()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_51a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_06()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_45()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_16()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_04()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_write_02()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_81a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getParameter_Servlet_for_loop_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_53a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_74a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_21()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_31()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_66a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_for_loop_68a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_10()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_22a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_67a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_13()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_52a()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getCookies_Servlet_write_05()).runTest(request, response);
			(new testcases.CWE400_Resource_Exhaustion.s01.CWE400_Resource_Exhaustion__getQueryString_Servlet_write_16()).runTest(request, response);
			/* END-AUTOGENERATED-SERVLET-TESTS-4 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

			/* END-AUTOGENERATED-SERVLET-TESTS-5 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

			/* END-AUTOGENERATED-SERVLET-TESTS-6 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

			/* END-AUTOGENERATED-SERVLET-TESTS-7 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */

			/* END-AUTOGENERATED-SERVLET-TESTS-8 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

			/* END-AUTOGENERATED-SERVLET-TESTS-9 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
