package com.ft.aio.template.adapter.output.web.scrippt.shift

@PlanningEntity
data class Shift(
    @PlanningId
    var id: Long? = null,

    @PlanningVariable(valueRangeProviderRefs = ["employeeRange"])
    var employee: Employee? = null,

    var day: Int = 0,  // Day of the shift
    var shiftType: String = "Morning" // Could be "Morning", "Afternoon", "Night"
)