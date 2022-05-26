package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.p351c.C8187s2;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

public class EditPlaylistActivity extends BaseActivity {

    /* renamed from: B */
    private DeepDefaultTitle f30586B;

    /* renamed from: C */
    private FrameLayout f30587C;

    /* renamed from: D */
    private long f30588D;

    /* renamed from: coocent.music.player.activity.EditPlaylistActivity$a */
    class C6866a extends C7970w {
        C6866a() {
        }

        /* renamed from: c */
        public void mo26627c() {
            if (EditPlaylistActivity.this.m39035B2()) {
                EditPlaylistActivity.this.m39044s2();
            }
        }

        /* renamed from: t */
        public void mo26591t() {
            super.mo26591t();
            EditPlaylistActivity.this.m39043r2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public boolean m39035B2() {
        Fragment X = mo3730H1().mo3936X(R.id.fragment);
        if (X instanceof C8187s2) {
            return ((C8187s2) X).mo29850p3();
        }
        return false;
    }

    /* renamed from: C2 */
    private void m39036C2(int i) {
        FrameLayout frameLayout = this.f30587C;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, i);
        }
    }

    /* renamed from: D2 */
    private void m39037D2() {
        this.f30586B.setTitleOnClickListener(new C6866a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: E2 */
    private void m39038E2() {
        if (C8343s.f34788c == BaseApplication.f31162z) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(8208);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
    }

    /* renamed from: F2 */
    public static void m39039F2(Context context, long j) {
        Intent intent = new Intent(context, EditPlaylistActivity.class);
        intent.putExtra("playlistId", j);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m39043r2() {
        new AlertDialog.Builder(this).setTitle(R.string.exit_editing).setMessage(R.string.exit_edit_tip).setPositiveButton(17039379, new C6987n(this)).setNegativeButton(17039369, C6984m.f31047g).create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public void m39044s2() {
        finish();
    }

    /* renamed from: t2 */
    private void m39045t2() {
        long longExtra = getIntent().getLongExtra("playlistId", -1);
        this.f30588D = longExtra;
        if (longExtra < 0) {
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
            finish();
        }
    }

    /* renamed from: u2 */
    private void m39046u2() {
        C8187s2 o3 = C8187s2.m45178o3(this.f30588D);
        C0620p i = mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, o3);
        i.mo3816j();
    }

    /* renamed from: v2 */
    private void m39047v2() {
        this.f30586B = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30587C = (FrameLayout) findViewById(R.id.fragment);
        ImageView imageView = (ImageView) findViewById(R.id.library_bg);
        findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30586B.setHomeIcon(false);
        this.f30586B.setMutilIcon(false);
        this.f30586B.setMenuIcon(false);
        this.f30586B.setEqIcon(false);
        this.f30586B.setSearchIcon(false);
        this.f30586B.setOkIcon(true);
        this.f30586B.setTitleText(C8345u.m46333n(R.string.edit_play_list));
        this.f30586B.mo27431B(true, true);
        this.f30586B.setTitleBackgroundColor(C8343s.m46295c(R.color.library_title_backgroud_color));
        C8343s.m46307o(imageView, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo26626x2(DialogInterface dialogInterface, int i) {
        m39044s2();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo26625A2(int i) {
        if (i == 1) {
            m39036C2(BaseApplication.f31157u);
        } else {
            m39036C2(C9566f.m50190a(this, 5));
        }
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        return null;
    }

    public void onBackPressed() {
        m39043r2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7397j.m41734d(this);
        m39038E2();
        setContentView((int) R.layout.activity_edit_playlist);
        m39045t2();
        m39047v2();
        m39046u2();
        m39037D2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6981l(this));
    }
}
