package ex09package;

import java.util.Date;

import ex09package.study.util.CommonUtil;

public class E01PackageMain {


	public static void main(String[] args) {


		Date utilDate = new Date();
		System.out.println("sqlDate="+ utilDate);

		java.sql.Date sqlDate = 
				new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate=" + sqlDate);

		String strValue = "987654321";
		boolean isNum = CommonUtil.isNumber(strValue);
		if(isNum==true)
			System. out.println("문자열은 숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
		System.out.println(
				ex09package.study.util.CommonUtil.isNumber("백20"));
	}
}