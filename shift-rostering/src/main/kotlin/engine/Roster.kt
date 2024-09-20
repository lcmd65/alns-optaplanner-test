package com.ft.aio.template.adapter.output.web.scrippt.engine
import org.optaplanner.core.api.domain.solution.PlanningScore
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
import org.optaplanner.core.api.domain.solution.PlanningSolution
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore
import org.optaplanner.core.api.score.Score

@PlanningSolution
data class Roster(
    @PlanningEntityCollectionProperty
    var shiftList: List<Shift> = listOf(),

    @ValueRangeProvider(id = "employeeRange")
    var employeeList: List<Employee> = listOf(),

    @PlanningScore
    var score: HardSoftScore = HardSoftScore.ZERO
)