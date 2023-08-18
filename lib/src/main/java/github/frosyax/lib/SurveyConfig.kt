package github.frosyax.lib

import kotlinx.serialization.Serializable

@JvmInline
@Serializable
value class SurveyConfig(
    val data: Map<String, String>,
) : Map<String, String> by data {

    companion object {

        val default = SurveyConfig(data = emptyMap())
    }
}