package com.ft.aio.template.adapter.output.web.scrippt.employee
import org.optaplanner.core.api.domain.entity.*

@PlanningEntity
data class Employee(
    val id: String,
    val name: String,
    val workDays: Double
)