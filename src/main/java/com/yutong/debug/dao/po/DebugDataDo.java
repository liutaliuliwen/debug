package com.yutong.debug.dao.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "debug_data")
public class DebugDataDo implements Serializable {
    /**
     * 主键 系统自动生成
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 调试用户id
     */
    @Column(name = "debug_user_id")
    private Integer debugUserId;

    /**
     * 单位名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 设备型号
     */
    @Column(name = "equipment_name")
    private String equipmentName;

    /**
     * 物料名称
     */
    @Column(name = "material_name")
    private String materialName;

    /**
     * 湿份名称
     */
    @Column(name = "moisture_content")
    private Float moistureContent;

    /**
     * 投料量（kg/h）
     */
    @Column(name = "feeding_amount")
    private Float feedingAmount;

    /**
     * 原料湿含量（w/w%）
     */
    @Column(name = "inlet_humidity_ratio")
    private Float inletHumidityRatio;

    /**
     * 原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     */
    @Column(name = "raw_material_state")
    private Integer rawMaterialState;

    /**
     * 原料目数
     */
    @Column(name = "raw_material_mesh")
    private Integer rawMaterialMesh;

    /**
     * 物料熔点
     */
    @Column(name = "melting_point")
    private Float meltingPoint;

    /**
     * 热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     */
    @Column(name = "heat_source_type")
    private Integer heatSourceType;

    /**
     * 热源温度
     */
    @Column(name = "heat_source_temperature")
    private Float heatSourceTemperature;

    /**
     * 热源压力
     */
    @Column(name = "heat_source_pressure")
    private Float heatSourcePressure;

    /**
     * 原料进料温度（℃）
     */
    @Column(name = "inlet_material_temperature")
    private Float inletMaterialTemperature;

    /**
     * 进风温度（℃）
     */
    @Column(name = "inlet_air_temperature")
    private Float inletAirTemperature;

    /**
     * 出风温度（℃）
     */
    @Column(name = "outlet_air_temperature")
    private Float outletAirTemperature;

    /**
     * 冷却风温度（℃）
     */
    @Column(name = "cool_air_temperature")
    private Float coolAirTemperature;

    /**
     * 出料温度（℃）
     */
    @Column(name = "outlet_material_temperature")
    private Float outletMaterialTemperature;

    /**
     * 产量（kg/h）
     */
    private Float output;

    /**
     * 终水分（w/w%）
     */
    @Column(name = "outlet_humidity_ratio")
    private Float outletHumidityRatio;

    /**
     * 其他（问题与建议）
     */
    private String remarks;

    /**
     * 调试上传时间
     */
    @Column(name = "upload_time")
    private Date uploadTime;

    /**
     * 调试用户名称
     */
    @Column(name = "upload_user")
    private String uploadUser;

    private static final long serialVersionUID = 1L;

    public DebugDataDo(Integer id, Integer debugUserId, String companyName, String equipmentName, String materialName, Float moistureContent, Float feedingAmount, Float inletHumidityRatio, Integer rawMaterialState, Integer rawMaterialMesh, Float meltingPoint, Integer heatSourceType, Float heatSourceTemperature, Float heatSourcePressure, Float inletMaterialTemperature, Float inletAirTemperature, Float outletAirTemperature, Float coolAirTemperature, Float outletMaterialTemperature, Float output, Float outletHumidityRatio, String remarks, Date uploadTime, String uploadUser) {
        this.id = id;
        this.debugUserId = debugUserId;
        this.companyName = companyName;
        this.equipmentName = equipmentName;
        this.materialName = materialName;
        this.moistureContent = moistureContent;
        this.feedingAmount = feedingAmount;
        this.inletHumidityRatio = inletHumidityRatio;
        this.rawMaterialState = rawMaterialState;
        this.rawMaterialMesh = rawMaterialMesh;
        this.meltingPoint = meltingPoint;
        this.heatSourceType = heatSourceType;
        this.heatSourceTemperature = heatSourceTemperature;
        this.heatSourcePressure = heatSourcePressure;
        this.inletMaterialTemperature = inletMaterialTemperature;
        this.inletAirTemperature = inletAirTemperature;
        this.outletAirTemperature = outletAirTemperature;
        this.coolAirTemperature = coolAirTemperature;
        this.outletMaterialTemperature = outletMaterialTemperature;
        this.output = output;
        this.outletHumidityRatio = outletHumidityRatio;
        this.remarks = remarks;
        this.uploadTime = uploadTime;
        this.uploadUser = uploadUser;
    }

    public DebugDataDo() {
        super();
    }

    /**
     * 获取主键 系统自动生成
     *
     * @return id - 主键 系统自动生成
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键 系统自动生成
     *
     * @param id 主键 系统自动生成
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取调试用户id
     *
     * @return debug_user_id - 调试用户id
     */
    public Integer getDebugUserId() {
        return debugUserId;
    }

    /**
     * 设置调试用户id
     *
     * @param debugUserId 调试用户id
     */
    public void setDebugUserId(Integer debugUserId) {
        this.debugUserId = debugUserId;
    }

    /**
     * 获取单位名称
     *
     * @return company_name - 单位名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置单位名称
     *
     * @param companyName 单位名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取设备型号
     *
     * @return equipment_name - 设备型号
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * 设置设备型号
     *
     * @param equipmentName 设备型号
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    /**
     * 获取物料名称
     *
     * @return material_name - 物料名称
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * 设置物料名称
     *
     * @param materialName 物料名称
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    /**
     * 获取湿份名称
     *
     * @return moisture_content - 湿份名称
     */
    public Float getMoistureContent() {
        return moistureContent;
    }

    /**
     * 设置湿份名称
     *
     * @param moistureContent 湿份名称
     */
    public void setMoistureContent(Float moistureContent) {
        this.moistureContent = moistureContent;
    }

    /**
     * 获取投料量（kg/h）
     *
     * @return feeding_amount - 投料量（kg/h）
     */
    public Float getFeedingAmount() {
        return feedingAmount;
    }

    /**
     * 设置投料量（kg/h）
     *
     * @param feedingAmount 投料量（kg/h）
     */
    public void setFeedingAmount(Float feedingAmount) {
        this.feedingAmount = feedingAmount;
    }

    /**
     * 获取原料湿含量（w/w%）
     *
     * @return inlet_humidity_ratio - 原料湿含量（w/w%）
     */
    public Float getInletHumidityRatio() {
        return inletHumidityRatio;
    }

    /**
     * 设置原料湿含量（w/w%）
     *
     * @param inletHumidityRatio 原料湿含量（w/w%）
     */
    public void setInletHumidityRatio(Float inletHumidityRatio) {
        this.inletHumidityRatio = inletHumidityRatio;
    }

    /**
     * 获取原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     *
     * @return raw_material_state - 原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     */
    public Integer getRawMaterialState() {
        return rawMaterialState;
    }

    /**
     * 设置原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     *
     * @param rawMaterialState 原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     */
    public void setRawMaterialState(Integer rawMaterialState) {
        this.rawMaterialState = rawMaterialState;
    }

    /**
     * 获取原料目数
     *
     * @return raw_material_mesh - 原料目数
     */
    public Integer getRawMaterialMesh() {
        return rawMaterialMesh;
    }

    /**
     * 设置原料目数
     *
     * @param rawMaterialMesh 原料目数
     */
    public void setRawMaterialMesh(Integer rawMaterialMesh) {
        this.rawMaterialMesh = rawMaterialMesh;
    }

    /**
     * 获取物料熔点
     *
     * @return melting_point - 物料熔点
     */
    public Float getMeltingPoint() {
        return meltingPoint;
    }

    /**
     * 设置物料熔点
     *
     * @param meltingPoint 物料熔点
     */
    public void setMeltingPoint(Float meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    /**
     * 获取热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     *
     * @return heat_source_type - 热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     */
    public Integer getHeatSourceType() {
        return heatSourceType;
    }

    /**
     * 设置热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     *
     * @param heatSourceType 热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     */
    public void setHeatSourceType(Integer heatSourceType) {
        this.heatSourceType = heatSourceType;
    }

    /**
     * 获取热源温度
     *
     * @return heat_source_temperature - 热源温度
     */
    public Float getHeatSourceTemperature() {
        return heatSourceTemperature;
    }

    /**
     * 设置热源温度
     *
     * @param heatSourceTemperature 热源温度
     */
    public void setHeatSourceTemperature(Float heatSourceTemperature) {
        this.heatSourceTemperature = heatSourceTemperature;
    }

    /**
     * 获取热源压力
     *
     * @return heat_source_pressure - 热源压力
     */
    public Float getHeatSourcePressure() {
        return heatSourcePressure;
    }

    /**
     * 设置热源压力
     *
     * @param heatSourcePressure 热源压力
     */
    public void setHeatSourcePressure(Float heatSourcePressure) {
        this.heatSourcePressure = heatSourcePressure;
    }

    /**
     * 获取原料进料温度（℃）
     *
     * @return inlet_material_temperature - 原料进料温度（℃）
     */
    public Float getInletMaterialTemperature() {
        return inletMaterialTemperature;
    }

    /**
     * 设置原料进料温度（℃）
     *
     * @param inletMaterialTemperature 原料进料温度（℃）
     */
    public void setInletMaterialTemperature(Float inletMaterialTemperature) {
        this.inletMaterialTemperature = inletMaterialTemperature;
    }

    /**
     * 获取进风温度（℃）
     *
     * @return inlet_air_temperature - 进风温度（℃）
     */
    public Float getInletAirTemperature() {
        return inletAirTemperature;
    }

    /**
     * 设置进风温度（℃）
     *
     * @param inletAirTemperature 进风温度（℃）
     */
    public void setInletAirTemperature(Float inletAirTemperature) {
        this.inletAirTemperature = inletAirTemperature;
    }

    /**
     * 获取出风温度（℃）
     *
     * @return outlet_air_temperature - 出风温度（℃）
     */
    public Float getOutletAirTemperature() {
        return outletAirTemperature;
    }

    /**
     * 设置出风温度（℃）
     *
     * @param outletAirTemperature 出风温度（℃）
     */
    public void setOutletAirTemperature(Float outletAirTemperature) {
        this.outletAirTemperature = outletAirTemperature;
    }

    /**
     * 获取冷却风温度（℃）
     *
     * @return cool_air_temperature - 冷却风温度（℃）
     */
    public Float getCoolAirTemperature() {
        return coolAirTemperature;
    }

    /**
     * 设置冷却风温度（℃）
     *
     * @param coolAirTemperature 冷却风温度（℃）
     */
    public void setCoolAirTemperature(Float coolAirTemperature) {
        this.coolAirTemperature = coolAirTemperature;
    }

    /**
     * 获取出料温度（℃）
     *
     * @return outlet_material_temperature - 出料温度（℃）
     */
    public Float getOutletMaterialTemperature() {
        return outletMaterialTemperature;
    }

    /**
     * 设置出料温度（℃）
     *
     * @param outletMaterialTemperature 出料温度（℃）
     */
    public void setOutletMaterialTemperature(Float outletMaterialTemperature) {
        this.outletMaterialTemperature = outletMaterialTemperature;
    }

    /**
     * 获取产量（kg/h）
     *
     * @return output - 产量（kg/h）
     */
    public Float getOutput() {
        return output;
    }

    /**
     * 设置产量（kg/h）
     *
     * @param output 产量（kg/h）
     */
    public void setOutput(Float output) {
        this.output = output;
    }

    /**
     * 获取终水分（w/w%）
     *
     * @return outlet_humidity_ratio - 终水分（w/w%）
     */
    public Float getOutletHumidityRatio() {
        return outletHumidityRatio;
    }

    /**
     * 设置终水分（w/w%）
     *
     * @param outletHumidityRatio 终水分（w/w%）
     */
    public void setOutletHumidityRatio(Float outletHumidityRatio) {
        this.outletHumidityRatio = outletHumidityRatio;
    }

    /**
     * 获取其他（问题与建议）
     *
     * @return remarks - 其他（问题与建议）
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置其他（问题与建议）
     *
     * @param remarks 其他（问题与建议）
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取调试上传时间
     *
     * @return upload_time - 调试上传时间
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * 设置调试上传时间
     *
     * @param uploadTime 调试上传时间
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 获取调试用户名称
     *
     * @return upload_user - 调试用户名称
     */
    public String getUploadUser() {
        return uploadUser;
    }

    /**
     * 设置调试用户名称
     *
     * @param uploadUser 调试用户名称
     */
    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser == null ? null : uploadUser.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DebugDataDo other = (DebugDataDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDebugUserId() == null ? other.getDebugUserId() == null : this.getDebugUserId().equals(other.getDebugUserId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getEquipmentName() == null ? other.getEquipmentName() == null : this.getEquipmentName().equals(other.getEquipmentName()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getMoistureContent() == null ? other.getMoistureContent() == null : this.getMoistureContent().equals(other.getMoistureContent()))
            && (this.getFeedingAmount() == null ? other.getFeedingAmount() == null : this.getFeedingAmount().equals(other.getFeedingAmount()))
            && (this.getInletHumidityRatio() == null ? other.getInletHumidityRatio() == null : this.getInletHumidityRatio().equals(other.getInletHumidityRatio()))
            && (this.getRawMaterialState() == null ? other.getRawMaterialState() == null : this.getRawMaterialState().equals(other.getRawMaterialState()))
            && (this.getRawMaterialMesh() == null ? other.getRawMaterialMesh() == null : this.getRawMaterialMesh().equals(other.getRawMaterialMesh()))
            && (this.getMeltingPoint() == null ? other.getMeltingPoint() == null : this.getMeltingPoint().equals(other.getMeltingPoint()))
            && (this.getHeatSourceType() == null ? other.getHeatSourceType() == null : this.getHeatSourceType().equals(other.getHeatSourceType()))
            && (this.getHeatSourceTemperature() == null ? other.getHeatSourceTemperature() == null : this.getHeatSourceTemperature().equals(other.getHeatSourceTemperature()))
            && (this.getHeatSourcePressure() == null ? other.getHeatSourcePressure() == null : this.getHeatSourcePressure().equals(other.getHeatSourcePressure()))
            && (this.getInletMaterialTemperature() == null ? other.getInletMaterialTemperature() == null : this.getInletMaterialTemperature().equals(other.getInletMaterialTemperature()))
            && (this.getInletAirTemperature() == null ? other.getInletAirTemperature() == null : this.getInletAirTemperature().equals(other.getInletAirTemperature()))
            && (this.getOutletAirTemperature() == null ? other.getOutletAirTemperature() == null : this.getOutletAirTemperature().equals(other.getOutletAirTemperature()))
            && (this.getCoolAirTemperature() == null ? other.getCoolAirTemperature() == null : this.getCoolAirTemperature().equals(other.getCoolAirTemperature()))
            && (this.getOutletMaterialTemperature() == null ? other.getOutletMaterialTemperature() == null : this.getOutletMaterialTemperature().equals(other.getOutletMaterialTemperature()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()))
            && (this.getOutletHumidityRatio() == null ? other.getOutletHumidityRatio() == null : this.getOutletHumidityRatio().equals(other.getOutletHumidityRatio()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getUploadUser() == null ? other.getUploadUser() == null : this.getUploadUser().equals(other.getUploadUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDebugUserId() == null) ? 0 : getDebugUserId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getEquipmentName() == null) ? 0 : getEquipmentName().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getMoistureContent() == null) ? 0 : getMoistureContent().hashCode());
        result = prime * result + ((getFeedingAmount() == null) ? 0 : getFeedingAmount().hashCode());
        result = prime * result + ((getInletHumidityRatio() == null) ? 0 : getInletHumidityRatio().hashCode());
        result = prime * result + ((getRawMaterialState() == null) ? 0 : getRawMaterialState().hashCode());
        result = prime * result + ((getRawMaterialMesh() == null) ? 0 : getRawMaterialMesh().hashCode());
        result = prime * result + ((getMeltingPoint() == null) ? 0 : getMeltingPoint().hashCode());
        result = prime * result + ((getHeatSourceType() == null) ? 0 : getHeatSourceType().hashCode());
        result = prime * result + ((getHeatSourceTemperature() == null) ? 0 : getHeatSourceTemperature().hashCode());
        result = prime * result + ((getHeatSourcePressure() == null) ? 0 : getHeatSourcePressure().hashCode());
        result = prime * result + ((getInletMaterialTemperature() == null) ? 0 : getInletMaterialTemperature().hashCode());
        result = prime * result + ((getInletAirTemperature() == null) ? 0 : getInletAirTemperature().hashCode());
        result = prime * result + ((getOutletAirTemperature() == null) ? 0 : getOutletAirTemperature().hashCode());
        result = prime * result + ((getCoolAirTemperature() == null) ? 0 : getCoolAirTemperature().hashCode());
        result = prime * result + ((getOutletMaterialTemperature() == null) ? 0 : getOutletMaterialTemperature().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
        result = prime * result + ((getOutletHumidityRatio() == null) ? 0 : getOutletHumidityRatio().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getUploadUser() == null) ? 0 : getUploadUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", debugUserId=").append(debugUserId);
        sb.append(", companyName=").append(companyName);
        sb.append(", equipmentName=").append(equipmentName);
        sb.append(", materialName=").append(materialName);
        sb.append(", moistureContent=").append(moistureContent);
        sb.append(", feedingAmount=").append(feedingAmount);
        sb.append(", inletHumidityRatio=").append(inletHumidityRatio);
        sb.append(", rawMaterialState=").append(rawMaterialState);
        sb.append(", rawMaterialMesh=").append(rawMaterialMesh);
        sb.append(", meltingPoint=").append(meltingPoint);
        sb.append(", heatSourceType=").append(heatSourceType);
        sb.append(", heatSourceTemperature=").append(heatSourceTemperature);
        sb.append(", heatSourcePressure=").append(heatSourcePressure);
        sb.append(", inletMaterialTemperature=").append(inletMaterialTemperature);
        sb.append(", inletAirTemperature=").append(inletAirTemperature);
        sb.append(", outletAirTemperature=").append(outletAirTemperature);
        sb.append(", coolAirTemperature=").append(coolAirTemperature);
        sb.append(", outletMaterialTemperature=").append(outletMaterialTemperature);
        sb.append(", output=").append(output);
        sb.append(", outletHumidityRatio=").append(outletHumidityRatio);
        sb.append(", remarks=").append(remarks);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", uploadUser=").append(uploadUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}