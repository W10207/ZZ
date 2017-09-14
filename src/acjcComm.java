/*
 * Created on 2004-01-03
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */


import java.math.BigDecimal;
import java.util.Map;

//import com.icsc.ac.dao.acjcb1DAO;
//import com.icsc.ac.dao.acjcb1VO;
//import com.icsc.ac.dao.acjcb2DAO;
//import com.icsc.ac.dao.acjcb2VO;
//import com.icsc.ac.dao.acjcb4DAO;
//import com.icsc.ac.dao.acjcb4VO;
//import com.icsc.ac.ini.acjcConstant;
//import com.icsc.am.dao.amjcbaDAO;
//import com.icsc.am.dao.amjcbaVO;
//import com.icsc.dpms.dd.msg.ddjcMsg;
//import com.icsc.dpms.de.dejc308;
//import com.icsc.dpms.de.dejc309;
//import com.icsc.dpms.de.dejc315;
//import com.icsc.dpms.de.dejc323;
//import com.icsc.dpms.de.structs.dejcActionResult;
//import com.icsc.dpms.ds.dsjccom;
//import com.icsc.dpms.du.dujctb01;
//import com.icsc.ip.dao.ipjcpdBaseDAO;
//import com.icsc.ip.dao.ipjcpdBaseVO;
//import com.icsc.ip.dao.ipjcrdDAO;
//import com.icsc.ip.dao.ipjcrdVO;

/**
 * @author 潘建
 * 
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class acjcComm {
	public final static String CLASS_VERSION = "$Revision: 1.1 $ $Date: 2016/10/24 06:14:04 $";

	//
//	/**
//	 * 取得公司�?
//	 * 
//	 * @param dsCom
//	 * @return
//	 */
//	public static String getCompanyId(dsjccom dsCom) {
//		return dsCom.companyId;
//	}
//
//	/**
//	 * 取得異動�?
//	 * 
//	 * @param dsCom
//	 * @return
//	 */
//	public static String getUserId(dsjccom dsCom) {
//		return dsCom.user.ID;
//	}
//
//	/**
//	 * 由職工編號取得員工中文姓�?
//	 * 
//	 * @param dscom
//	 * @param empNo
//	 * @return
//	 */
//	public static String getEmpChnName(dsjccom dscom, String empNo) {
//		dujctb01 du01 = new dujctb01(dscom, empNo, "");
//		du01 = du01.iDu01("A");
//		if (du01.cName == null)
//			return "";
//		else
//			return du01.cName;
//	}
//
//	/**
//	 * 抓DE公用表格，返回下拉選單資�?
//	 * 
//	 * @param dsCom
//	 * @param tableName
//	 * @return
//	 */
//	public static String[][] getDETable(dsjccom dsCom, String tableName) {
//		dejc323[] table = null;
//		dejc323 de323 = null;
//		String result[][] = null;
//
//		try {
//			table = dejc323.getByTabId(dsCom, tableName);
//			int count = table.length;
//			result = new String[2][];
//			result[0] = new String[count];
//			result[1] = new String[count];
//			for (int i = 0; count > 0 && i < count; i++) {
//				de323 = table[i];
//				result[0][i] = de323.getDe323Field1();
//				result[1][i] = de323.getDe323Field2();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			result = null;
//		}
//		return result;
//	}
//
//	/**
//	 * 日期轉換
//	 * 
//	 * @param str
//	 * @return
//	 */
//	public static String coverDate(String str) {
//		dejc309 de309 = new dejc309();
//		String errCode = "";
//		String ret = "";
//		if (!str.equals("") && str.length() == 8) {
//			errCode = de309.checkDate(str);
//			if (!"*".equals(errCode)) {
//				ret = de309.getDateLFmt2();
//			}
//		} else if (!str.equals("") && str.length() == 6) {
//			errCode = de309.checkDate(str + "01");
//			if (!"*".equals(errCode)) {
//				ret = de309.getDateLFmt2().substring(0, 7);
//			}
//		}
//
//		else
//			ret = str;
//		return ret;
//	}
//
//	/**
//	 * 取得兩�?時間之間的差異時�?
//	 * 
//	 * @param date1
//	 * @param date2
//	 * @return
//	 */
//	public static String getDifferenceTime(String date1, String date2) {
//		String differenctTime = "";
//		if (date1 != null && !date1.equals("") && date2 != null && !date2.equals("")) {
//			dejc315 de315 = new dejc315();
//			String date1To = date1.substring(0, 8);
//			String time1 = date1.substring(8, 14);
//			String date2To = date2.substring(0, 8);
//			String time2 = date2.substring(8, 14);
//			String errCode = de315.computeTimeOfDiff(date1To, time1, date2To, time2);
//			if (errCode.equals("*")) {
//				differenctTime = "";
//			} else {
//				long seconds = de315.getDiffInSeconds();
//				int hours = (int) (seconds / 3600);
//				int minutes = (int) ((seconds - hours * 3600) / 60);
//				String m = "";
//				if (minutes >= 0 && minutes < 10)
//					m = "0" + minutes;
//				else
//					m = String.valueOf(minutes);
//				differenctTime = String.valueOf(hours) + ":" + m;
//			}
//		}
//		return differenctTime;
//	}
//
//	/**
//	 * 轉換時間至畫面格�?當地)
//	 * 
//	 * @param time
//	 * @return
//	 */
//	public static String toLocalTime(String time) {
//		dejc309 de309 = new dejc309();
//		// YYYYMMDDHHMM格式轉化
//		if (time != null && !time.equals("") && time.length() == 12) {
//			String date = time.substring(0, 8);
//			String errCode = de309.checkDate(date);
//			String timed = "*".equals(errCode) ? "" : de309.getDateWFmt2();
//			String timeh = time.substring(8, 10);
//			int th = Integer.parseInt(timeh);
//			String timem = time.substring(10, 12);
//			int tm = Integer.parseInt(timem);
//			if (!timed.equals("") && th >= 0 && th < 24 && tm >= 0 && tm < 60) {
//				time = timed + " " + timeh + ":" + timem;
//			}
//			return time;
//		}
//
//		// YYYYMMDD格式轉化
//		if ("" != time && time.length() == 8) {
//			String errCode = de309.checkDate(time);
//			if (!"*".equals(errCode))
//				time = de309.getDateWFmt2();
//			return time;
//		}
//
//		// YYYYMM格式轉化
//		if ("" != time && time.length() == 6) {
//			String errCode = de309.checkDate(time + "01");
//			if (!"*".equals(errCode))
//				time = de309.getDateWFmt2().substring(0, 7);
//			return time;
//		}
//
//		// HHMM格式轉化
//		if (time != null && !time.equals("") && (time.length() == 4)) {
//			String timeh = time.substring(0, 2);
//			int th = Integer.parseInt(timeh);
//			String timem = time.substring(2, 4);
//			int tm = Integer.parseInt(timem);
//			if (th >= 0 && th < 24 && tm >= 0 && tm < 60)
//				time = timeh + ":" + timem;
//			return time;
//		}
//
//		return time;
//
//	}
//
//	/**
//	 * 轉化日期至資料庫格式（西元）
//	 * 
//	 * @param time
//	 * @return
//	 */
//	public static String toDBTime(String time) {
//		if (time != null && !time.equals("")) {
//			dejc309 de309 = new dejc309();
//			// 轉化YYYY/MM/DD HH:MM格式
//			if (time.length() == 16) {
//				String timenew16 = time.trim();
//				String date16 = timenew16.substring(0, 10);
//				String errCode = de309.checkDate(date16);
//				String timed16 = "*".equals(errCode) ? "" : de309.getDateWFmt1();
//				String timeh16 = timenew16.substring(10, 12);
//				int th16 = Integer.parseInt(timeh16);
//				String timem16 = timenew16.substring(13, 15);
//				int tm16 = Integer.parseInt(timem16);
//				if (!timed16.equals("") && th16 >= 0 && th16 < 24 && tm16 >= 0 && tm16 < 60
//						&& timenew16.substring(12, 13).equals(":")) {
//					time = timed16 + timeh16 + timem16;
//				}
//			}
//			// 轉化YYYY/MM/DD格式
//			if (time.length() == 10) {
//				String errCode = de309.checkDate(time);
//				if (!errCode.equals("*"))
//					time = de309.getDateWFmt1();
//			}
//			// 轉化YYYY/MM格式
//			if (time.length() == 7) {
//				time = time.substring(0, 4) + time.substring(5, 7);
//			}
//			return time;
//		} else
//			return "";
//	}
//
//	/**
//	 * 取得當前日期
//	 * 
//	 * @return
//	 */
//	public static String nowDate() {
//		dejc308 de308 = new dejc308();
//		return de308.getCrntDateWFmt1();
//	}
//
//	/**
//	 * 取得當前時間
//	 * 
//	 * @return
//	 */
//	public static String nowTime() {
//		dejc308 de308 = new dejc308();
//		return de308.getCrntTimeFmt1();
//	}
//
//	/**
//	 * 取得當前年份
//	 * 
//	 * @return
//	 */
//	public static String nowYear() {
//		dejc308 de308 = new dejc308();
//		return de308.getCrntDateWFmt1().substring(0, 4);
//	}
//
//	/**
//	 * 取得當前年月
//	 * 
//	 * @return
//	 */
//	public static String nowYyMm() {
//		dejc308 de308 = new dejc308();
//		return de308.getCrntDateWFmt1().substring(0, 6);
//	}
//
//	/**
//	 * 取得年月日小時分
//	 * 
//	 * @return
//	 */
//	public static String nowDateTime() {
//		dejc308 de308 = new dejc308();
//		return de308.getCrntDateWFmt1() + de308.getCrntTimeFmt1().substring(0, 4);
//	}
//
//	/**
//	 * 不得為空�?
//	 * 
//	 * @param ae
//	 *            dejcActionResult�?
//	 * @param s
//	 *            要檢查的文字
//	 * @param fieldName
//	 *            在jsp中，該欄位的名稱
//	 * @param voName
//	 *            Vo Name是什�?
//	 * @return 檢查是否有錯�?
//	 */
//	public static boolean checkEmpty(dejcActionResult ae, String s, String fieldName, String voName) {
//		if (s.trim().length() == 0) {
//			if (voName.trim().length() > 0)
//				ae.addFieldError(fieldName, voName, "不可為空�?);
//			else
//				ae.addFieldError(fieldName, "不可為空�?);
//			return true;
//		}
//		return false;
//	}
//
//	/**
//	 * 檢查日期是否正確，允許空�?
//	 * 
//	 * @param ae
//	 *            dejcActionResult�?
//	 * @param s
//	 *            要檢查的文字
//	 * @param fieldName
//	 *            在jsp中，該欄位的名稱
//	 * @param voName
//	 *            Vo Name是什�?
//	 * @return 檢查是否有錯�?
//	 */
//	public boolean checkDateFormate(dejcActionResult ae, String s, String fieldName, String voName) {
//		if (s.trim().length() > 0) {
//			return checkNoEmptyDateFormate(ae, s, fieldName, voName);
//		}
//		return false;
//	}
//
//	/**
//	 * 檢查是否為數�?
//	 * 
//	 * @param ae
//	 *            dejcActionResult�?
//	 * @param s
//	 *            要檢查的文字
//	 * @param fieldName
//	 *            在jsp中，該欄位的名稱
//	 * @param voName
//	 *            Vo Name是什�?
//	 * @return 檢查是否有錯�?
//	 */
//	public static boolean checkInteger(dejcActionResult ae, String s, String fieldName, String voName) {
//		try {
//			Integer.parseInt(s);
//			return false;
//		} catch (NumberFormatException e) {
//			if (voName.trim().length() > 0)
//				ae.addFieldError(fieldName, voName, "數字格式錯誤");
//			else
//				ae.addFieldError(fieldName, "數字格式錯誤");
//			return true;
//		}
//	}
//
//	/**
//	 * 檢查欄位內的日期是否正確，�?且一定不得為空白�?
//	 * 
//	 * @param ae
//	 *            dejcActionResult�?
//	 * @param s
//	 *            要檢查的文字
//	 * @param fieldName
//	 *            在jsp中，該欄位的名稱
//	 * @param voName
//	 *            Vo Name是什�?
//	 * @return 檢查是否有錯�?
//	 */
//	public static boolean checkNoEmptyDateFormate(dejcActionResult ae, String s, String fieldName, String voName) {
//		if (s.trim().length() == 0) {
//			ae.addFieldError(fieldName, voName, "不可為空�?);
//			return true;
//		} else {
//			dejc309 de309 = new dejc309();
//			if (de309.checkDate(s).equals("*")) {
//				if (voName.trim().length() > 0)
//					ae.addFieldError(fieldName, voName, "日期格式錯誤");
//				else
//					ae.addFieldError(fieldName, "日期格式錯誤");
//				return true;
//			}
//			return false;
//		}
//	}
//
//	/**
//	 * 檢查日期不能為空，且格式是否正確(年月)
//	 * 
//	 * @param ae
//	 * @param s
//	 * @param fieldName
//	 * @param voName
//	 * @return
//	 */
//	public static boolean checkYMFormate(dejcActionResult ae, String s, String fieldName, String voName) {
//		if (s.trim().length() == 0) {
//			ae.addFieldError(fieldName, voName, "不可為空�?);
//		} else {
//			// 日期第一位數�?��不要�?
//			char c1 = s.charAt(0);
//			if (c1 == '0')
//				ae.addFieldError(fieldName, voName, "日期開始格式有誤");
//			// 檢查年�?月輸入�?只能為數�?
//			for (int i = 0; i < s.length(); i++) {
//				char c = s.charAt(i);
//				if (!(c >= '0' && c <= '9')) {
//					ae.addFieldError(fieldName, voName, "日期格式有誤");
//					return true;
//				}
//			}
//			// 檢查月份位數只能�?位數
//			if (s.length() > 6) {
//				ae.addFieldError(fieldName, voName, "月份位數為六位數");
//				return true;
//			}
//			// 檢查月份�?��只有12月份
//			if (s.length() > 4 && s.length() <= 6) {
//				String str = s.substring(4, 6);
//				System.out.println("str==" + str);
//				if (str.compareTo("12") > 0) {
//					ae.addFieldError(fieldName, voName, "�?��只有12月份");
//				}
//			}
//
//		}
//		return false;
//	}
//
//	/**
//	 * 檢查日期不能為空，且格式是否正確(�?
//	 * 
//	 * @param ae
//	 * @param s
//	 * @param fieldName
//	 * @param voName
//	 * @return
//	 */
//	public static boolean checkYearFormate(dejcActionResult ae, String s, String fieldName, String voName) {
//		if (s.trim().length() == 0) {
//			ae.addFieldError(fieldName, voName, "不可為空�?);
//		} else {
//			// 日期第一位數�?��不要�?
//			char c1 = s.charAt(0);
//			if (c1 == '0')
//				ae.addFieldError(fieldName, voName, "日期開始格式有誤");
//			// 檢查年�?月輸入�?只能為數�?
//			for (int i = 0; i < s.length(); i++) {
//				char c = s.charAt(i);
//				if (!(c >= '0' && c <= '9')) {
//					ae.addFieldError(fieldName, voName, "日期格式有誤");
//					return true;
//				}
//			}
//			// 檢查月份位數只能�?位數
//			if (s.length() > 4) {
//				ae.addFieldError(fieldName, voName, "年份位數為四位數");
//				return true;
//			}
//		}
//		return false;
//	}
//
//	/**
//	 * 設置數字形態
//	 * 
//	 * @param bg
//	 * @return
//	 */
//	public static String setDecimal(BigDecimal bg, int num) {
//		String ret = "";
//		if (bg.compareTo(new BigDecimal(0)) > 0) {
//			ret = String.valueOf(bg.setScale(num, BigDecimal.ROUND_HALF_UP));
//		}
//
//		return ret;
//	}
//
//	/**
//	 * 設置int型數字欄位的形態
//	 * 
//	 * @param bg
//	 * @return
//	 */
//	public static String setInteger(int num) {
//		String ret = "";
//		if (num != 0)
//			ret = String.valueOf(num);
//		return ret;
//	}
//
//	/**
//	 * 取得上下限設置數字型�?
//	 * 
//	 * @param bd
//	 * @return
//	 */
//	public static String checkNumber(Map qryMap, int num, String col) {
//		String ret = "";
//		BigDecimal bg = null == qryMap.get(col) ? new BigDecimal(0) : new BigDecimal((String) qryMap.get(col));
//		if (null != bg && bg.compareTo(new BigDecimal(0)) != 0) {
//			ret = String.valueOf(bg.setScale(num, BigDecimal.ROUND_HALF_UP));
//		}
//		return ret;
//	}
//
//	/**
//	 * 取得成本中心中文名稱
//	 * 
//	 * @param compId
//	 * @param fiscalYear
//	 * @param costCenter
//	 * @param dsCom
//	 * @return
//	 */
//	public static String getCostCenterDesc(String compId, String fiscalYear, String costCenter, dsjccom dsCom) {
//		String costCenterDesc = "";
//		try {
//			acjcb1DAO acb1DAO = new acjcb1DAO(dsCom);
//			acjcb1VO acb1 = acb1DAO.findByPK(compId, fiscalYear, costCenter);
//			if (acb1 != null) {
//				costCenterDesc = acb1.getCostCenterDesc();
//			}
//		} catch (Exception ex) {
//			return "出錯";
//		}
//		return costCenterDesc;
//	}
//
//	public static String getCostCenterDesc(dsjccom dsCom, String compId, String fiscalYear, String cc) {
//		try {
//			acjcb1DAO b1DAO = new acjcb1DAO(dsCom);
//			return b1DAO.findByPK(compId, fiscalYear, cc).getCostCenterDesc();
//		} catch (Exception e) {
//			return "";
//		}
//	}
//
//	/**
//	 * 取得會計歸屬的中文名�?
//	 * 
//	 * @param dsCom
//	 * @param allocCode
//	 * @return
//	 */
//	public static String getAllocCodeDesc(dsjccom dsCom, String allocCode) {
//		String allocCodeDesc = "";
//		String[][] allocCodes = getDETable(dsCom, "ACU001");
//		for (int i = 0; i < allocCodes[0].length; i++) {
//			if (allocCodes[0][i].equals(allocCode)) {
//				allocCodeDesc = allocCodes[1][i];
//				break;
//			}
//		}
//		return allocCodeDesc;
//	}
//
//	/**
//	 * 取得成本中心形態屬�?的中文名�?
//	 * 
//	 * @param ccType
//	 * @return
//	 */
//	public static String getCcTypeDesc(String ccType) {
//		String ccTypeDesc = "";
//		String[][] ccTypes = acjcConstant.getCcType();
//		for (int i = 0; i < ccTypes.length; i++) {
//			if (ccTypes[i][0].equals(ccType)) {
//				ccTypeDesc = ccTypes[i][1];
//				break;
//			}
//		}
//		return ccTypeDesc;
//	}
//
//	/**
//	 * 取得產品產出屬�?的中文名�?
//	 * 
//	 * @param ccProdAttrib
//	 * @return
//	 */
//	public static String getCcProdAttribDesc(String ccProdAttrib) {
//		String ccProdAttribDesc = "";
//		if (ccProdAttrib.equals("Y"))
//			ccProdAttribDesc = "有產品產�?;
//		if (ccProdAttrib.equals("N"))
//			ccProdAttribDesc = "無產品產�?;
//		return ccProdAttribDesc;
//	}
//
//	/**
//	 * 取得�?��碼的中文名稱
//	 * 
//	 * @param stusCode
//	 * @return
//	 */
//	public static String getStusCodeDesc(String stusCode) {
//		if ("U".equals(stusCode))
//			return "改啟�?;
//		else if ("D".equals(stusCode))
//			return new ddjcMsg("ac").get("INACTIVE");
//		return new ddjcMsg("ac").get("USING");
//	}
//
//	/**
//	 * 取得成本科目的中文名�?
//	 * 
//	 * @param compId
//	 * @param wce
//	 * @param dsCom
//	 * @return
//	 */
//	public static String getWCEDesc(String compId, String wce, dsjccom dsCom) {
//		String WCEDesc = "";
//		try {
//			acjcb2DAO acb2DAO = new acjcb2DAO(dsCom);
//			acjcb2VO acb2 = acb2DAO.findByPK(compId, wce);
//			if (acb2 != null) {
//				WCEDesc = acb2.getWceDesc();
//			}
//		} catch (Exception ex) {
//			return "出錯";
//		}
//		return WCEDesc;
//	}
//
//	/**
//	 * 取得產副品的中文名稱
//	 * 
//	 * @param dsCom
//	 * @param compId
//	 *            公司�?
//	 * @param PDNATURE_PD
//	 *            特�?
//	 * @param prodCode
//	 *            產副品代�?
//	 * @return
//	 */
//	public static String getProdName(dsjccom dsCom, String compId, String prodCode, String PDNATURE_PD) {
//		String prodName = "";
//		ipjcpdBaseDAO ipBaseDAO = new ipjcpdBaseDAO(dsCom);
//		ipjcpdBaseVO obj = new ipjcpdBaseVO();
//		try {
//			if (prodCode == null || prodCode.equals("")) {
//				prodName = "";
//			} else {
//				obj = (ipjcpdBaseVO) ipBaseDAO.findByPK(compId, PDNATURE_PD, prodCode);
//				prodName = obj.getProdCodeDesc();
//			}
//
//		} catch (Exception e) {
//		}
//		return prodName;
//	}
//
//	/**
//	 * 取得對應年月的最大日�?
//	 * 
//	 * @param closeMonth
//	 * @return String
//	 * @author 吳少�?
//	 * @since 2004/02/12
//	 */
//	public static String maxDayOfMonth(String closeMonth) {
//		dejc309 de309 = new dejc309();
//		de309.checkDate(closeMonth + "01");
//		return closeMonth + de309.getMaxDayOfMonth();
//	}
//
//	/**
//	 * 取得作業代號的中文名�?
//	 * 
//	 * @return
//	 */
//	public static String getActivityDesc(String compId, String fiscalYear, String costCenter, String activityCode,
//			dsjccom dsCom) {
//		String activityDesc = "";
//		try {
//			amjcbaDAO ambaDAO = new amjcbaDAO(dsCom);
//			amjcbaVO ambaVO = ambaDAO.findByPK(compId, fiscalYear, costCenter, activityCode);
//			if (ambaVO != null) {
//				activityDesc = ambaVO.getActivityDesc();
//			}
//		} catch (Exception ex) {
//			return "出錯";
//		}
//		return activityDesc;
//	}
//
//	/**
//	 * 求攤出成本科�?
//	 * 
//	 * @param compId
//	 * @param fiscalYear
//	 * @param costCenter
//	 * @param expenseType
//	 * @param dsCom
//	 * @return
//	 */
//	public static String getChargeWCE(String compId, String fiscalYear, String costCenter, String activityCode,
//			dsjccom dsCom) {
//		String chargeWCE = "";
//		try {
//			amjcbaDAO ambaDAO = new amjcbaDAO(dsCom);
//			amjcbaVO ambaVO = ambaDAO.findByPK(compId, fiscalYear, costCenter, activityCode);
//			if (ambaVO != null) {
//				chargeWCE = ambaVO.getChargeWCE();
//			}
//		} catch (Exception ex) {
//			return "出錯";
//		}
//		return chargeWCE;
//	}
//	
//	
//	// 取得归属名称
//		public static String getWaName(dsjccom dsCom, String compId, String wa) {
//			try {
//				ipjcrdVO rdVO = new ipjcrdDAO(dsCom).findByIA(compId, "01012007", wa);
//				if (rdVO == null) {
//					return "";
//				}
//				return rdVO.getDataA();
//			} catch (Exception ex) {
//				return "";
//		}
//	}
//
//	// 取得工序名称
//	public static String getProcessName(dsjccom dsCom, String compId, String fiscalYear,
//			String process) {
//		try {
//			acjcb4VO b4VO = new acjcb4DAO(dsCom).findByPK(compId, fiscalYear, process);
//
//			if (b4VO == null) {
//				return "";
//			}
//			return b4VO.getProcessDesc();
//		} catch (Exception ex) {
//			return "";
//		}
//	}
}
