package coocent.music.player.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0136e;
import androidx.appcompat.app.C0142i;
import p342g.p343a.p344a.p358i.C8313e;

public class AnimationActivity extends AppCompatActivity {
    /* renamed from: Q1 */
    public C0136e mo470Q1() {
        return C0142i.m793R0(this, this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C8313e.m45967a(), C8313e.m45968b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8313e.m45971e(this);
    }
}
