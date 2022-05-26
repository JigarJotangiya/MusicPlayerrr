package com.coocent.test;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.coocent.marquee.C2280j;
import com.coocent.marquee.C2296m;
import com.coocent.marquee.C2297n;
import com.coocent.marquee.C2298o;
import com.coocent.marquee.C2308s;
import com.coocent.marquee.C2310t;
import com.coocent.marquee.MarqueeActivity;
import com.coocent.marquee.MarqueeSmallCircleView;
import com.coocent.marquee.MarqueeSweepGradientView;
import com.coocent.marquee.p053ui.MarqueeSettings2Activity;

public class TestMarqueeActivity extends AppCompatActivity {

    /* renamed from: A */
    private MarqueeSmallCircleView f8914A;

    /* renamed from: B */
    private AudioManager f8915B;

    /* renamed from: z */
    private MarqueeSweepGradientView f8916z;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 85) {
            Log.d("TAGF", "onActivityResult_0x01_getMarqueeFloatingEnable=" + C2296m.m10659c(this));
            C2280j.m10620f(this, this.f8916z, this.f8915B.isMusicActive());
            C2280j.m10619e(this, this.f8914A);
        }
    }

    public void onBackPressed() {
        finish();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C2308s.edgeLighting) {
            Log.d("TAGF", "edgeLighting_getMarqueeFloatingEnable=" + C2296m.m10659c(this));
            C2298o.C2299a aVar = new C2298o.C2299a();
            aVar.mo9042u(Color.parseColor("#323233"));
            aVar.mo9041t(Color.parseColor("#FF0048"));
            aVar.mo9033k(false);
            aVar.mo9023a();
            startActivityForResult(new Intent(this, MarqueeActivity.class), 85);
        } else if (id == C2308s.openPlayer) {
            try {
                Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                intent.addFlags(268435456);
                startActivity(intent);
            } catch (Exception unused) {
            }
        } else if (id == C2308s.tv_start_settings2) {
            C2298o.C2299a aVar2 = new C2298o.C2299a();
            aVar2.mo9042u(Color.parseColor("#323233"));
            aVar2.mo9041t(Color.parseColor("#FF0048"));
            aVar2.mo9033k(false);
            aVar2.mo9037o(Color.parseColor("#3C3C3D"));
            aVar2.mo9034l(Color.parseColor("#3C3C3D"));
            aVar2.mo9035m(Color.parseColor("#3C3C3D"));
            aVar2.mo9038p(-65536);
            aVar2.mo9036n(-65536);
            aVar2.mo9023a();
            startActivityForResult(new Intent(this, MarqueeSettings2Activity.class), 85);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2310t.activity_marquee_test);
        this.f8915B = (AudioManager) getSystemService("audio");
        C2298o.C2299a aVar = new C2298o.C2299a();
        aVar.mo9026d("#00cef6");
        aVar.mo9028f("#00ff4f");
        aVar.mo9030h("#fffa00");
        aVar.mo9023a();
        C2297n.m10665b(this, false);
        MarqueeSweepGradientView marqueeSweepGradientView = (MarqueeSweepGradientView) findViewById(C2308s.marqueeSweepGradientView);
        this.f8916z = marqueeSweepGradientView;
        C2280j.m10620f(this, marqueeSweepGradientView, this.f8915B.isMusicActive());
        MarqueeSmallCircleView marqueeSmallCircleView = (MarqueeSmallCircleView) findViewById(C2308s.marqueeSmallCircleView);
        this.f8914A = marqueeSmallCircleView;
        C2280j.m10619e(this, marqueeSmallCircleView);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
