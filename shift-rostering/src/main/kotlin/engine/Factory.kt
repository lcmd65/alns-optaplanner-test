package com.ft.aio.template.adapter.output.web.scrippt.engine
import org.optaplanner.core.api.solver.SolverFactory
import org.optaplanner.core.config.solver.SolverConfig
import com.ft.aio.template.adapter.output.web.scrippt.shift.Shift
import com.ft.aio.template.adapter.output.web.scrippt.constraint.Constraint

class Factory {
    fun createSolverFactory(): SolverFactory<Roster> {
        val solverConfig = SolverConfig()
            .withSolutionClass(Roster::class.java)
            .withEntityClasses(Shift::class.java)
            .withConstraintProviderClass(Constraint::class.java) // Define your constraints here

        return SolverFactory.create(solverConfig)
    }

}