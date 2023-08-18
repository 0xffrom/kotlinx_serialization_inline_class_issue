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

/**
Process: github.frosyaX.kotlinX_value_class_sample, PID: 24738
java.lang.IllegalAccessError: Final field 'e.c.b' cannot be written to by method 'java.lang.Object e.a.b(b0.b)' (declaration of 'e.a' appears in /data/app/~~VCTnd_psFPHb6iCMguQ8rg==/github.frosyaX.kotlinX_value_class_sample-sOua_23PZEkNu4nHKj-GrQ==/base.apk)
at e.a.b(SourceFile:43)
at e0.j.p(SourceFile:6)
at github.frosyaX.kotlinX_value_class_sample.MainActivity.onCreate(SourceFile:40)
at android.app.Activity.performCreate(Activity.java:8595)
at android.app.Activity.performCreate(Activity.java:8573)
at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1456)
at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3764)
at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3922)
at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:103)
at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:139)
at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:96)
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2443)
at android.os.Handler.dispatchMessage(Handler.java:106)
at android.os.Looper.loopOnce(Looper.java:205)
at android.os.Looper.loop(Looper.java:294)
at android.app.ActivityThread.main(ActivityThread.java:8176)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:552)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:971)
 */