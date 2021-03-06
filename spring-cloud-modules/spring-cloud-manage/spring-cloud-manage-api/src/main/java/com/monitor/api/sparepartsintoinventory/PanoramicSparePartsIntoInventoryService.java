package com.monitor.api.sparepartsintoinventory;

import com.cloud.core.IService;
import com.monitor.dto.sparepartsintoinventory.PanoramicSparePartsIntoInventoryDto;
import com.monitor.model.sparepartsintoinventory.PanoramicSparePartsIntoInventory;

import java.util.List;


/**
* @author summer
* 2017/12/26.
*/
public interface PanoramicSparePartsIntoInventoryService extends IService<PanoramicSparePartsIntoInventory> {
	
	/**
	 * 周单位获取入库产品货值
	 * @param date
	 * @return
	 */
	List<PanoramicSparePartsIntoInventoryDto> findWeeklyInSummary(String date);
	
	/**
	 * 周单位获取出库产品货值
	 * @param date
	 * @return
	 * 
	 */
	List<PanoramicSparePartsIntoInventoryDto> findWeeklyOutSummary(String date);
	
	/**
	 * 月单位获取消耗产品货值
	 * @param date
	 * @return
	 */
	List<PanoramicSparePartsIntoInventoryDto> findMonthlyMaxPrice(String date);
	
	/**
	 * 月单位获取消耗产品量
	 * @param date
	 * @return
	 */
	List<PanoramicSparePartsIntoInventoryDto> findMonthlyMaxValue(String date);
	
	/**
	 * 指定日期的备品备件入出库量
	 * @param date
	 * @param type
	 * @return
	 */
	List<PanoramicSparePartsIntoInventory> listDayInventory(String date,String type);
}
