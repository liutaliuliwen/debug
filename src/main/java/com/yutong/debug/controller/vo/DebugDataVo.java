package com.yutong.debug.controller.vo;



import java.util.Date;


public class DebugDataVo  {

    /**
     * 调试用户id
     */

    private Integer debugUserId;

    /**
     * 单位名称
     */

    private String companyName;

    /**
     * 设备型号
     */

    private String equipmentName;

    /**
     * 物料名称
     */

    private String materialName;

    /**
     * 湿份名称
     */

    private Float moistureContent;

    /**
     * 投料量（kg/h）
     */

    private Float feedingAmount;

    /**
     * 原料湿含量（w/w%）
     */

    private Float inletHumidityRatio;

    /**
     * 原料初始状态：1溶液  2浆状  3块状物料 4散粒状物料  5粉状物料（目数：_____目）
6无定形的生物植物类物料

     */

    private Integer rawMaterialState;

    /**
     * 原料目数
     */

    private Integer rawMaterialMesh;

    /**
     * 物料熔点
     */

    private Float meltingPoint;

    /**
     * 热源型式：□蒸汽（蒸气压（现场表压）：________MPa）  □导热油（压力：______MPa；温度：______℃）□热水（压力：______MPa；温度：______℃）

     */

    private Integer heatSourceType;

    /**
     * 热源温度
     */

    private Float heatSourceTemperature;

    /**
     * 热源压力
     */

    private Float heatSourcePressure;

    /**
     * 原料进料温度（℃）
     */

    private Float inletMaterialTemperature;

    /**
     * 进风温度（℃）
     */

    private Float inletAirTemperature;

    /**
     * 出风温度（℃）
     */

    private Float outletAirTemperature;

    /**
     * 冷却风温度（℃）
     */

    private Float coolAirTemperature;

    /**
     * 出料温度（℃）
     */

    private Float outletMaterialTemperature;

    /**
     * 产量（kg/h）
     */
    private Float output;

    /**
     * 终水分（w/w%）
     */

    private Float outletHumidityRatio;

    /**
     * 其他（问题与建议）
     */
    private String remarks;

    /**
     * 调试上传时间
     */

    private Date uploadTime;

    /**
     * 调试用户名称
     */
    private String uploadUser;

    private static final long serialVersionUID = 1L;



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


}