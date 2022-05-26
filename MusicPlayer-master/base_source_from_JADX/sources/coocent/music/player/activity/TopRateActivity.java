package coocent.music.player.activity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

public class TopRateActivity extends AppCompatActivity {

    /* renamed from: A */
    private int f30963A = -1;

    /* renamed from: B */
    private int f30964B = -1;

    /* renamed from: z */
    private long f30965z = -1;

    /* renamed from: d2 */
    private void m39884d2() {
        this.f30965z = -1;
        this.f30964B = -1;
    }

    /* renamed from: e2 */
    private void m39885e2(int i, Intent intent) {
        if (i == -1) {
            Cursor cursor = null;
            try {
                Uri data = intent.getData();
                String[] strArr = {"_data"};
                cursor = getContentResolver().query(data, strArr, (String) null, (String[]) null, (String) null);
                cursor.moveToFirst();
                String string = cursor.getString(cursor.getColumnIndex(strArr[0]));
                cursor.close();
                m39888i2(string, this.f30963A, this.f30965z, this.f30964B);
            } catch (Exception e) {
                e.printStackTrace();
                m39884d2();
            } catch (Throwable th) {
                cursor.close();
                m39884d2();
                throw th;
            }
            cursor.close();
            m39884d2();
        }
    }

    /* renamed from: g2 */
    private void m39886g2(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("artwork_url");
            int intExtra = intent.getIntExtra("artwork_type", -1);
            long longExtra = intent.getLongExtra("artwork_id", -1);
            int intExtra2 = intent.getIntExtra("artwork_position", -1);
            if (stringExtra.isEmpty() || intExtra == -1 || longExtra == -1 || intExtra2 == -1) {
                C8344t.m46314b(this, R.string.page_error);
            } else {
                m39888i2(stringExtra, intExtra, longExtra, intExtra2);
            }
        }
    }

    /* renamed from: h2 */
    private void m39887h2() {
        setContentView((int) R.layout.activity_toprate);
    }

    /* renamed from: i2 */
    private void m39888i2(String str, int i, long j, int i2) {
        new C8337n(this).mo30261u1(C8311c.m45963b(i), j, str);
        Intent intent = new Intent(C8311c.m45962a(i));
        intent.putExtra("artwork_position", i2);
        sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        m39884d2();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1020) {
            m39885e2(i2, intent);
        } else if (i == 1021 && i2 == 1022) {
            m39886g2(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.library_backgroud_color));
        }
        m39887h2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
