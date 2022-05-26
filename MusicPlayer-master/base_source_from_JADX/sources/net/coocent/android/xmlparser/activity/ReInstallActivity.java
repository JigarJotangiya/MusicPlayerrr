package net.coocent.android.xmlparser.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import net.coocent.android.xmlparser.p461z.C9564d;

public class ReInstallActivity extends AppCompatActivity {

    /* renamed from: net.coocent.android.xmlparser.activity.ReInstallActivity$a */
    class C9361a implements DialogInterface.OnClickListener {
        C9361a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C9564d.m50177c(ReInstallActivity.this);
            ReInstallActivity.this.finishAffinity();
            System.exit(0);
        }
    }

    /* renamed from: net.coocent.android.xmlparser.activity.ReInstallActivity$b */
    class C9362b implements DialogInterface.OnClickListener {
        C9362b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ReInstallActivity.this.finishAffinity();
            System.exit(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0133c.C0134a aVar = new C0133c.C0134a(this);
        aVar.mo645p("Installation failed");
        aVar.mo633d(false);
        aVar.mo637h("The app " + getApplicationInfo().loadLabel(getPackageManager()).toString() + " is missing required components and must be reinstalled from the Google Play Store");
        aVar.mo639j("Close", new C9362b());
        aVar.mo642m("Reinstall", new C9361a());
        aVar.mo647r();
    }
}
