package com.groupfour.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.groupfour.entity.MedicinePerscription;
import com.groupfour.entity.RegisterInfo;

public interface DiagnosisDao {

	public RegisterInfo getRegisterInfoByRegisterId(@Param("registerId")String registerId);
	
	public List<MedicinePerscription> getMpListByRegisterId(@Param("registerId")String registerId,@Param("flag")Integer flag);

	public boolean saveMedicinePerscription(List<MedicinePerscription> mpList);

	public boolean addMedicinePerscription(@Param("registerId")String registerId, @Param("medicineId")String medicineId,@Param("num")int num);
	
}
