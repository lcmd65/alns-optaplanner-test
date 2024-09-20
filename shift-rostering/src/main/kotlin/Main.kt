package com.ft.aio.template.adapter.output.web.scrippt
import com.ft.aio.template.adapter.output.web.scrippt.shift.Shift
import com.ft.aio.template.adapter.output.web.scrippt.employee.Employee
import com.ft.aio.template.adapter.output.web.scrippt.engine.*

fun main() {
    val solverFactory = Factory().createSolverFactory()
    val initialRoster = Roster()

    val solver = solverFactory.buildSolver()
    val solution = solver.solve(initialRoster)

    println("Best solution: $solution")
}