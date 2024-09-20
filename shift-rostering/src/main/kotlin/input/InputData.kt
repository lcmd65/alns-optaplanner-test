package com.ft.aio.template.adapter.output.web.scrippt.input

import com.ft.aio.template.adapter.output.web.scrippt.employee.Employee
import com.ft.aio.template.adapter.output.web.scrippt.shift.Shift

data class InputData (
    var shifts: List<Shift>,
    var employees: List<Employee>
){
}