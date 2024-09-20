package com.ft.aio.template.adapter.output.web.scrippt.engine
import com.ft.aio.template.adapter.output.web.scrippt.utils.ReadJson
import com.ft.aio.template.adapter.output.web.scrippt.input.InputData
import com.google.gson.Gson;

open class PreProcess {

    fun dataPreprocessing(): InputData{
        var jsonString = ReadJson().readJson("shift-rostering/src/main/resources/dump/data_dummy.json")

        val data = Gson().fromJson(jsonString, InputData:: class.java)
        return data
    }
}