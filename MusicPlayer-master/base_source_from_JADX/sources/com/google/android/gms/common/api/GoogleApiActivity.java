package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C3235b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C3181e;
import com.google.android.gms.common.internal.C3292l;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    protected int f10312g = 0;

    @RecentlyNonNull
    /* renamed from: a */
    public static Intent m13765a(@RecentlyNonNull Context context, @RecentlyNonNull PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    private final void m13766b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f10312g = 1;
            } catch (ActivityNotFoundException e) {
                if (extras.getBoolean("notify_manager", true)) {
                    C3181e.m13868m(this).mo11585u(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String valueOf = String.valueOf(pendingIntent);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(valueOf);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e);
                }
                this.f10312g = 1;
                finish();
            } catch (IntentSender.SendIntentException e2) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                finish();
            }
        } else {
            C3292l.m14240h(num);
            C3235b.m14015l().mo11684m(this, num.intValue(), 2, this);
            this.f10312g = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f10312g = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C3181e m = C3181e.m13868m(this);
                if (i2 == -1) {
                    m.mo11581q();
                } else if (i2 == 0) {
                    m.mo11585u(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f10312g = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.f10312g = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10312g = bundle.getInt("resolution");
        }
        if (this.f10312g != 1) {
            m13766b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.f10312g);
        super.onSaveInstanceState(bundle);
    }
}
