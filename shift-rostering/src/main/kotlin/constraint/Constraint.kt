package com.ft.aio.template.adapter.output.web.scrippt.constraint
import org.optaplanner.core.api.score.stream.Constraint
import org.optaplanner.core.api.score.stream.ConstraintFactory
import org.optaplanner.core.api.score.stream.ConstraintProvider
import com.ft.aio.template.adapter.output.web.scrippt.shift.Shift
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore

class Constraint :ConstraintProvider {
    override fun defineConstraints(constraintFactory: ConstraintFactory): Array<Constraint> {
        return arrayOf(
            constraintFactory.from(Shift::class.java)
                .filter { it.employee == null }
                .penalize("Unassigned shift", HardSoftScore.ONE_HARD)
        )
    }
}