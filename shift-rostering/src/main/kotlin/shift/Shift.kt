package com.ft.aio.template.adapter.output.web.scrippt.shift
import org.optaplanner.core.api.domain.entity.*
import org.optaplanner.core.api.domain.lookup.PlanningId
import org.optaplanner.core.api.domain.variable.PlanningVariable
import com.ft.aio.template.adapter.output.web.scrippt.employee.Employee




@PlanningEntity
data class Shift(
    @PlanningId
    var id: String? = null,

    @PlanningVariable(valueRangeProviderRefs = ["employeeRange"])
    var employee: Employee? = null,
    var name: String,
    var duration: Int,
    var day: Int,
    var shiftType: String,
)