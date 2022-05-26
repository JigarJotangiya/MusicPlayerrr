package coocent.music.player.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0136e;
import androidx.fragment.app.Fragment;
import coocent.music.player.adapter.TrackAdapter;
import coocent.music.player.service.MusicService;
import coocent.music.player.widget.SlidingLayout;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p349f.p351c.C8049a3;
import p342g.p343a.p344a.p349f.p351c.C8061b3;
import p342g.p343a.p344a.p349f.p351c.C8071c3;
import p342g.p343a.p344a.p349f.p351c.C8081d3;
import p342g.p343a.p344a.p349f.p351c.C8090e3;
import p342g.p343a.p344a.p349f.p351c.C8105g3;
import p342g.p343a.p344a.p349f.p351c.C8127k2;
import p342g.p343a.p344a.p349f.p351c.C8133l2;
import p342g.p343a.p344a.p349f.p351c.C8143m2;
import p342g.p343a.p344a.p349f.p351c.C8150n2;
import p342g.p343a.p344a.p349f.p351c.C8158o2;
import p342g.p343a.p344a.p349f.p351c.C8167p2;
import p342g.p343a.p344a.p349f.p351c.C8174q2;
import p342g.p343a.p344a.p349f.p351c.C8194t2;
import p342g.p343a.p344a.p349f.p351c.C8200u2;
import p342g.p343a.p344a.p349f.p351c.C8209v2;
import p342g.p343a.p344a.p349f.p351c.C8220x2;
import p342g.p343a.p344a.p349f.p351c.C8231y2;
import p342g.p343a.p344a.p355g.C8287e;

public abstract class BaseActivity extends AppCompatActivity implements ServiceConnection, C7958k {

    /* renamed from: A */
    private boolean f30395A = false;

    /* renamed from: z */
    private C8287e.C8290c f30396z;

    public BaseActivity() {
        new ArrayList();
    }

    /* renamed from: l2 */
    public static boolean m38762l2(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (str.equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n2 */
    private void m38763n2() {
        if (mo26491h2()) {
            new SlidingLayout(this).mo27648a(this);
        }
    }

    /* renamed from: A */
    public void mo26484A() {
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
    }

    /* renamed from: M0 */
    public void mo26486M0() {
    }

    /* renamed from: Z */
    public void mo26487Z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public void mo26488d2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e2 */
    public void mo26489e2() {
        this.f30396z = C8287e.m45837f(this, this);
    }

    /* renamed from: g2 */
    public void mo26490g2(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Fragment i22 = mo26492i2();
        if (i22 instanceof C8071c3) {
            C8071c3 c3Var = (C8071c3) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter = c3Var.f34098k0;
                if (trackAdapter == null) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter.mo26909f(false, 0);
                } else if (i4 == 1) {
                    trackAdapter.mo26913k();
                }
            } else if (i3 != 1 && i3 == 2) {
                c3Var.mo29661W3(i4);
            }
        } else if (i22 instanceof C8105g3) {
            C8105g3 g3Var = (C8105g3) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter2 = g3Var.f34195k0;
                if (trackAdapter2 == null) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter2.mo26909f(false, 0);
                } else if (i4 == 1) {
                    trackAdapter2.mo26913k();
                }
            } else if (i3 == 1) {
                boolean z = g3Var.mo3690p0() instanceof C8194t2;
                if (i4 == 0) {
                    C4477c.m19568D0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19568D0(this, "title_key DESC");
                } else if (i4 == 2) {
                    C4477c.m19568D0(this, "album");
                } else if (i4 == 3) {
                    C4477c.m19568D0(this, "artist");
                } else if (i4 == 4) {
                    C4477c.m19568D0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19568D0(this, "year DESC");
                } else if (i4 == 11) {
                    C4477c.m19568D0(this, "date_added DESC");
                }
                g3Var.mo29726h3(false);
            } else if (i3 == 2) {
                g3Var.mo29728i4(i4);
            }
        } else if (i22 instanceof C8167p2) {
            C8167p2 p2Var = (C8167p2) i22;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i4 == 0) {
                        C4477c.m19652w0(this, "artist_key");
                    } else if (i4 == 1) {
                        C4477c.m19652w0(this, "artist_key DESC");
                    } else if (i4 == 6) {
                        C4477c.m19652w0(this, "number_of_tracks DESC");
                    } else if (i4 == 7) {
                        C4477c.m19652w0(this, "number_of_albums DESC");
                    } else if (i4 == 3) {
                        C4477c.m19652w0(this, "artist_key");
                    }
                    p2Var.mo29818h3(false);
                } else if (i3 == 2) {
                    p2Var.mo29817V3(i4);
                }
            }
        } else if (i22 instanceof C8143m2) {
            C8143m2 m2Var = (C8143m2) i22;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i4 == 0) {
                        C4477c.m19646t0(this, "album_key");
                    } else if (i4 == 1) {
                        C4477c.m19646t0(this, "album_key DESC");
                    } else if (i4 == 5) {
                        C4477c.m19646t0(this, "minyear DESC");
                    } else if (i4 == 3) {
                        C4477c.m19646t0(this, "artist");
                    } else if (i4 == 6) {
                        C4477c.m19646t0(this, "numsongs DESC");
                    }
                    m2Var.mo29782h3(false);
                } else if (i3 == 2) {
                    m2Var.mo29781U3(i4);
                }
            }
        } else if (i22 instanceof C8231y2) {
            C8231y2 y2Var = (C8231y2) i22;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i4 == 0) {
                        C4477c.m19566C0(this, "name");
                    } else if (i4 == 1) {
                        C4477c.m19566C0(this, "name DESC");
                    }
                    y2Var.mo29916h3(false);
                } else if (i3 == 2) {
                    y2Var.mo29918z3(i4);
                }
            }
        } else if (i22 instanceof C8209v2) {
            C8209v2 v2Var = (C8209v2) i22;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i4 == 10) {
                        C4477c.m19562A0(this, "_data");
                    } else if (i4 == 6) {
                        C4477c.m19562A0(this, "songCount");
                    }
                    v2Var.mo29887h3(false);
                } else if (i3 == 2) {
                    v2Var.mo29886L3(i4);
                }
            }
        } else if (i22 instanceof C8049a3) {
            C8049a3 a3Var = (C8049a3) i22;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i4 == 8) {
                        C4477c.m19572F0(this, "name");
                    } else if (i4 == 9) {
                        C4477c.m19572F0(this, "_ID");
                    } else if (i4 == 6) {
                        C4477c.m19572F0(this, "songCount DESC");
                    }
                    a3Var.mo29610k3(false);
                } else if (i3 == 2) {
                    a3Var.mo29609g4(i4);
                }
            }
        } else if (i22 instanceof C8133l2) {
            C8133l2 l2Var = (C8133l2) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter3 = l2Var.f34257k0;
                if (trackAdapter3 == null) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter3.mo26909f(false, 0);
                } else {
                    trackAdapter3.mo26913k();
                }
            } else if (i3 == 1) {
                if (i4 == 0) {
                    C4477c.m19644s0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19644s0(this, "title_key DESC");
                } else if (i4 == 4) {
                    C4477c.m19644s0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19644s0(this, "year DESC");
                }
                l2Var.mo29766h3(false, false);
            } else if (i3 == 2) {
                l2Var.mo29765Z3(i4);
            }
        } else if (i22 instanceof C8200u2) {
            C8200u2 u2Var = (C8200u2) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter4 = u2Var.f34444k0;
                if (trackAdapter4 == null) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter4.mo26909f(false, 0);
                } else {
                    trackAdapter4.mo26913k();
                }
            } else if (i3 == 1) {
                if (i4 == 0) {
                    C4477c.m19658z0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19658z0(this, "title_key DESC");
                } else if (i4 == 2) {
                    C4477c.m19658z0(this, "album");
                } else if (i4 == 3) {
                    C4477c.m19658z0(this, "artist");
                } else if (i4 == 4) {
                    C4477c.m19658z0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19658z0(this, "year DESC");
                }
                u2Var.mo29874h3();
            } else if (i3 == 2) {
                u2Var.mo29873a4(i4);
            }
        } else if (i22 instanceof C8061b3) {
            C8061b3 b3Var = (C8061b3) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter5 = b3Var.f34069k0;
                if (!(trackAdapter5 instanceof TrackAdapter)) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter5.mo26909f(true, trackAdapter5.mo26912j());
                } else {
                    trackAdapter5.mo26913k();
                }
            } else if (i3 == 1) {
                if (i4 == 0) {
                    C4477c.m19570E0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19570E0(this, "title_key DESC");
                } else if (i4 == 2) {
                    C4477c.m19570E0(this, "album");
                } else if (i4 == 3) {
                    C4477c.m19570E0(this, "artist");
                } else if (i4 == 4) {
                    C4477c.m19570E0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19570E0(this, "year DESC");
                }
                b3Var.mo29640h3();
            } else if (i3 == 2) {
                b3Var.mo29643t4(i4);
            }
        } else if (i22 instanceof C8220x2) {
            C8220x2 x2Var = (C8220x2) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter6 = x2Var.f34499k0;
                if (!(trackAdapter6 instanceof TrackAdapter)) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter6.mo26909f(true, trackAdapter6.mo26912j());
                } else {
                    trackAdapter6.mo26913k();
                }
            } else if (i3 == 1) {
                if (i4 == 0) {
                    C4477c.m19564B0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19564B0(this, "title_key DESC");
                } else if (i4 == 2) {
                    C4477c.m19564B0(this, "album");
                } else if (i4 == 3) {
                    C4477c.m19564B0(this, "artist");
                } else if (i4 == 4) {
                    C4477c.m19564B0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19564B0(this, "year DESC");
                }
                x2Var.mo29906h3(false);
            } else if (i3 == 2) {
                x2Var.mo29905U3(i4);
            }
        } else if (i22 instanceof C8158o2) {
            C8158o2 o2Var = (C8158o2) i22;
            List<Fragment> h0 = o2Var.mo3642W().mo3956h0();
            if (h0 != null && h0.size() > 0) {
                Fragment fragment = h0.get(o2Var.f34340t0.getCurrentItem());
                if (fragment instanceof C8174q2) {
                    C8174q2 q2Var = (C8174q2) fragment;
                    if (i3 == 0) {
                        TrackAdapter trackAdapter7 = q2Var.f34382l0;
                        if (!(trackAdapter7 instanceof TrackAdapter)) {
                            return;
                        }
                        if (i4 == 0) {
                            trackAdapter7.mo26909f(false, trackAdapter7.mo26912j());
                        } else {
                            trackAdapter7.mo26913k();
                        }
                    } else if (i3 == 1) {
                        if (i4 == 0) {
                            C4477c.m19650v0(this, "title_key");
                        } else if (i4 == 1) {
                            C4477c.m19650v0(this, "title_key DESC");
                        } else if (i4 == 2) {
                            C4477c.m19650v0(this, "album");
                        } else if (i4 == 3) {
                            C4477c.m19650v0(this, "title_key");
                        } else if (i4 == 4) {
                            C4477c.m19650v0(this, "duration DESC");
                        } else if (i4 == 5) {
                            C4477c.m19650v0(this, "year DESC");
                        }
                        q2Var.mo29834h3(false, false);
                    } else if (i3 == 2) {
                        q2Var.mo29833P3(i4);
                    }
                } else if (fragment instanceof C8150n2) {
                    C8150n2 n2Var = (C8150n2) fragment;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            if (i4 == 0) {
                                C4477c.m19648u0(this, "album_key");
                            } else if (i4 == 1) {
                                C4477c.m19648u0(this, "album_key DESC");
                            } else if (i4 == 5) {
                                C4477c.m19648u0(this, "minyear DESC");
                            } else if (i4 == 6) {
                                C4477c.m19648u0(this, "numsongs DESC");
                            }
                            n2Var.mo29793h3(false, false);
                        } else if (i3 == 2) {
                            n2Var.mo29792F3(i4);
                        }
                    }
                }
            }
        } else if (i22 instanceof C8081d3) {
            C8081d3 d3Var = (C8081d3) i22;
            if (i3 == 0) {
                TrackAdapter trackAdapter8 = d3Var.f34124k0;
                if (trackAdapter8 == null) {
                    return;
                }
                if (i4 == 0) {
                    trackAdapter8.mo26909f(false, trackAdapter8.mo26912j());
                } else {
                    trackAdapter8.mo26913k();
                }
            } else if (i3 == 1) {
                if (i4 == 0) {
                    C4477c.m19564B0(this, "title_key");
                } else if (i4 == 1) {
                    C4477c.m19564B0(this, "title_key DESC");
                } else if (i4 == 2) {
                    C4477c.m19564B0(this, "album");
                } else if (i4 == 3) {
                    C4477c.m19564B0(this, "artist");
                } else if (i4 == 4) {
                    C4477c.m19564B0(this, "duration DESC");
                } else if (i4 == 5) {
                    C4477c.m19564B0(this, "year DESC");
                }
                d3Var.mo29682h3(false);
            } else if (i3 == 2) {
                d3Var.mo29681b4(i4);
            }
        } else if (i22 instanceof C8127k2) {
            if (i3 == 0) {
                super.onBackPressed();
            }
        } else if ((i22 instanceof C8090e3) && i3 == 0) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public boolean mo26491h2() {
        return false;
    }

    /* renamed from: i2 */
    public abstract Fragment mo26492i2();

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo26494j2() {
        int i = Build.VERSION.SDK_INT;
        View view = null;
        if (i > 11 && i < 19) {
            if (getWindow() != null) {
                view = getWindow().getDecorView();
            }
            if (view != null) {
                view.setSystemUiVisibility(8);
            }
        } else if (i >= 19) {
            if (getWindow() != null) {
                view = getWindow().getDecorView();
            }
            if (view != null) {
                view.setSystemUiVisibility(4098);
            }
        }
    }

    /* renamed from: k2 */
    public void mo26495k2() {
        try {
            if ((!m38762l2(this, MusicService.class.getName()) || C8287e.m45802Q() == null) && !this.f30395A) {
                mo26489e2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public void mo26496m2(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0136e.m725C(true);
        try {
            this.f30395A = true;
            mo26489e2();
            m38763n2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onDestroy() {
        mo26488d2();
        C8287e.C8290c cVar = this.f30396z;
        if (cVar != null) {
            C8287e.m45833d1(cVar);
            this.f30396z = null;
        }
        super.onDestroy();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MusicService.C7064c cVar = (MusicService.C7064c) iBinder;
        C8287e.f34684a = cVar;
        if (cVar != null) {
            cVar.mo27195p0(this);
        }
        this.f30395A = false;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f30395A = false;
    }

    /* renamed from: u1 */
    public void mo26499u1() {
    }
}
