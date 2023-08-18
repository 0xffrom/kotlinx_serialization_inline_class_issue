package github.frosyaX.kotlinX_value_class_sample

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import github.frosyax.lib.SurveyConfig
import kotlinx.serialization.json.Json

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val serializer = SurveyConfig.serializer()
        val config = Json.decodeFromString(serializer, """{ "test":  "test"}""")

        Toast.makeText(this, config.toString(), Toast.LENGTH_LONG).show()
    }
}
