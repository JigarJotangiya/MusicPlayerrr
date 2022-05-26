package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0315v;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.view.GiftBadgeActionView;
import net.coocent.android.xmlparser.widget.view.GiftSwitchView;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class DeepDefaultTitle extends RelativeLayout {

    /* renamed from: A */
    private GiftSwitchView f31521A;

    /* renamed from: B */
    private boolean f31522B = false;

    /* renamed from: C */
    private GiftBadgeActionView f31523C;

    /* renamed from: D */
    private boolean f31524D;

    /* renamed from: E */
    private ImageView f31525E;

    /* renamed from: F */
    private ImageView f31526F;

    /* renamed from: G */
    private RelativeLayout f31527G;

    /* renamed from: g */
    private Context f31528g;

    /* renamed from: h */
    private ImageView f31529h;

    /* renamed from: i */
    private RelativeLayout f31530i;

    /* renamed from: j */
    private TextView f31531j;

    /* renamed from: k */
    private ImageView f31532k;

    /* renamed from: l */
    private View f31533l;

    /* renamed from: m */
    private ImageView f31534m;

    /* renamed from: n */
    private ImageView f31535n;

    /* renamed from: o */
    private ImageView f31536o;

    /* renamed from: p */
    private ImageView f31537p;

    /* renamed from: q */
    private C0315v f31538q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C7970w f31539r;

    /* renamed from: s */
    private ImageView f31540s;

    /* renamed from: t */
    private TextView f31541t;

    /* renamed from: u */
    private ImageView f31542u;

    /* renamed from: v */
    private ImageView f31543v;

    /* renamed from: w */
    private ImageView f31544w;

    /* renamed from: x */
    private View f31545x;

    /* renamed from: y */
    private int f31546y = 0;

    /* renamed from: z */
    private TextView f31547z;

    /* renamed from: coocent.music.player.widget.DeepDefaultTitle$a */
    class C7133a implements View.OnClickListener {
        C7133a() {
        }

        @SuppressLint({"NonConstantResourceId"})
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ico_add_eq:
                    DeepDefaultTitle.this.m40610o();
                    return;
                case R.id.ico_back:
                    if (DeepDefaultTitle.this.f31539r != null) {
                        DeepDefaultTitle.this.f31539r.mo26591t();
                        return;
                    }
                    return;
                case R.id.ico_eq:
                    DeepDefaultTitle.this.m40616w(true);
                    return;
                case R.id.ico_home:
                    if (DeepDefaultTitle.this.f31539r != null) {
                        DeepDefaultTitle.this.f31539r.mo26591t();
                        return;
                    }
                    return;
                case R.id.ico_more:
                    DeepDefaultTitle.this.m40613t();
                    return;
                case R.id.ico_mutilOption:
                    DeepDefaultTitle.this.m40609n();
                    return;
                case R.id.ico_reset_eq:
                    DeepDefaultTitle.this.m40618y();
                    return;
                case R.id.ico_save_eq:
                    DeepDefaultTitle.this.m40619z();
                    return;
                case R.id.ico_search:
                    DeepDefaultTitle.this.m40617x();
                    return;
                case R.id.ico_theme:
                    DeepDefaultTitle.this.m40608m();
                    return;
                case R.id.iv_ok:
                    DeepDefaultTitle.this.m40615v();
                    return;
                case R.id.iv_week:
                    DeepDefaultTitle.this.m40596a0();
                    return;
                case R.id.tv_my_theme:
                    DeepDefaultTitle.this.m40614u();
                    return;
                default:
                    return;
            }
        }
    }

    public DeepDefaultTitle(Context context) {
        super(context);
        this.f31528g = context;
    }

    /* renamed from: D */
    private void m40581D() {
        ImageView imageView = this.f31535n;
        if (imageView != null) {
            imageView.setImageDrawable(C9332d.m49407d(getContext(), R.drawable.home_button07_sound_effect));
        }
    }

    /* renamed from: E */
    private void m40582E() {
        ViewGroup.LayoutParams layoutParams = this.f31521A.getLayoutParams();
        layoutParams.height = C9566f.m50190a(getContext(), 54);
        layoutParams.width = C9566f.m50190a(getContext(), 54);
        this.f31521A.setLayoutParams(layoutParams);
    }

    /* renamed from: L */
    private void m40583L() {
        this.f31523C.setGiftColor(C8343s.m46295c(R.color.default_text_color));
    }

    /* renamed from: M */
    private void m40584M() {
        C7133a aVar = new C7133a();
        this.f31529h.setOnClickListener(aVar);
        this.f31532k.setOnClickListener(aVar);
        this.f31534m.setOnClickListener(aVar);
        this.f31535n.setOnClickListener(aVar);
        this.f31537p.setOnClickListener(aVar);
        this.f31536o.setOnClickListener(aVar);
        this.f31540s.setOnClickListener(aVar);
        this.f31541t.setOnClickListener(aVar);
        this.f31542u.setOnClickListener(aVar);
        this.f31543v.setOnClickListener(aVar);
        this.f31544w.setOnClickListener(aVar);
        this.f31525E.setOnClickListener(aVar);
        this.f31526F.setOnClickListener(aVar);
        this.f31530i.setOnClickListener(aVar);
    }

    /* renamed from: N */
    private void m40585N() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26698v();
        }
    }

    /* renamed from: O */
    private void m40586O() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26699w();
        }
    }

    /* renamed from: P */
    private void m40587P() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26700x();
        }
    }

    /* renamed from: Q */
    private void m40588Q() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26697u();
        }
    }

    /* renamed from: R */
    private void m40589R() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26701y();
        }
    }

    /* renamed from: S */
    private void m40590S() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26702z();
        }
    }

    /* renamed from: T */
    private void m40591T() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26689A();
        }
    }

    /* renamed from: U */
    private void m40592U() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26690B();
        }
    }

    /* renamed from: Y */
    private void m40593Y() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26691D();
        }
    }

    /* renamed from: Z */
    private void m40594Z() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26692E();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m40596a0() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo29493F(this.f31525E);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m40608m() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo29494a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m40609n() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26693b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m40610o() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26785d();
        }
    }

    /* renamed from: q */
    private void m40611q() {
        this.f31533l = View.inflate(this.f31528g, R.layout.default_title, this);
        this.f31529h = (ImageView) findViewById(R.id.ico_home);
        this.f31530i = (RelativeLayout) findViewById(R.id.rl_default_title);
        this.f31531j = (TextView) findViewById(R.id.title);
        this.f31532k = (ImageView) findViewById(R.id.ico_back);
        mo27432C();
        this.f31534m = (ImageView) findViewById(R.id.ico_more);
        this.f31535n = (ImageView) findViewById(R.id.ico_eq);
        m40581D();
        this.f31536o = (ImageView) findViewById(R.id.ico_mutilOption);
        ImageView imageView = (ImageView) findViewById(R.id.ico_search);
        this.f31537p = imageView;
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home_button02_search_skin0, R.color.default_text_color));
        this.f31540s = (ImageView) findViewById(R.id.ico_theme);
        this.f31541t = (TextView) findViewById(R.id.tv_my_theme);
        this.f31542u = (ImageView) findViewById(R.id.ico_add_eq);
        this.f31543v = (ImageView) findViewById(R.id.ico_save_eq);
        this.f31544w = (ImageView) findViewById(R.id.ico_reset_eq);
        this.f31545x = findViewById(R.id.theme_point);
        this.f31527G = (RelativeLayout) findViewById(R.id.title_layout);
        this.f31547z = (TextView) findViewById(R.id.artist);
        this.f31531j.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f31521A = (GiftSwitchView) findViewById(R.id.iv_gift_cover);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_week);
        this.f31525E = imageView2;
        imageView2.setImageDrawable(C8343s.m46298f(R.drawable.ic_toolbar_11));
        ImageView imageView3 = (ImageView) findViewById(R.id.iv_ok);
        this.f31526F = imageView3;
        imageView3.setImageDrawable(C8343s.m46298f(R.drawable.ic_toolbar_04));
        this.f31523C = (GiftBadgeActionView) findViewById(R.id.gift_badge_action_view);
        m40582E();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ boolean mo27443s(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.equalizer) {
            m40616w(false);
            return true;
        } else if (itemId != R.id.select) {
            switch (itemId) {
                case R.id.menu_show_as_grid:
                    m40593Y();
                    return true;
                case R.id.menu_show_as_list:
                    m40594Z();
                    return true;
                case R.id.menu_sort_by_album:
                    m40585N();
                    return true;
                case R.id.menu_sort_by_album_number:
                    m40586O();
                    return true;
                case R.id.menu_sort_by_artist:
                    m40587P();
                    return true;
                case R.id.menu_sort_by_az:
                    m40588Q();
                    return true;
                case R.id.menu_sort_by_duration:
                    m40589R();
                    return true;
                case R.id.menu_sort_by_track_number:
                    m40590S();
                    return true;
                case R.id.menu_sort_by_year:
                    m40591T();
                    return true;
                case R.id.menu_sort_by_za:
                    m40592U();
                    return true;
                default:
                    return true;
            }
        } else {
            m40609n();
            return true;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NonConstantResourceId"})
    /* renamed from: t */
    public void m40613t() {
        if (!this.f31524D) {
            if (this.f31538q == null) {
                C0315v vVar = new C0315v(new ContextThemeWrapper(getContext(), R.style.PopupMenu), this.f31534m, C8345u.m46336q() ? 8388659 : 8388661);
                this.f31538q = vVar;
                vVar.mo2140b().inflate(R.menu.poupup_menu_home, this.f31538q.mo2139a());
                MenuItem findItem = this.f31538q.mo2139a().findItem(R.id.view_as_group);
                MenuItem findItem2 = this.f31538q.mo2139a().findItem(R.id.order_in_category);
                MenuItem findItem3 = this.f31538q.mo2139a().findItem(R.id.select);
                findItem3.setVisible(this.f31522B);
                int i = this.f31546y;
                if (i == 3) {
                    findItem2.setVisible(false);
                } else if (i == 4) {
                    findItem2.setVisible(false);
                } else {
                    findItem.setVisible(true);
                    findItem2.setVisible(true);
                    SubMenu subMenu = findItem2.getSubMenu();
                    MenuItem findItem4 = subMenu.findItem(R.id.menu_sort_by_year);
                    MenuItem findItem5 = subMenu.findItem(R.id.menu_sort_by_duration);
                    MenuItem findItem6 = subMenu.findItem(R.id.menu_sort_by_artist);
                    MenuItem findItem7 = subMenu.findItem(R.id.menu_sort_by_album);
                    MenuItem findItem8 = subMenu.findItem(R.id.menu_sort_by_track_number);
                    MenuItem findItem9 = subMenu.findItem(R.id.menu_sort_by_album_number);
                    int i2 = this.f31546y;
                    if (i2 == 0) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(true);
                        findItem7.setVisible(true);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                    } else if (i2 == 1) {
                        findItem4.setVisible(false);
                        findItem5.setVisible(false);
                        findItem6.setVisible(false);
                        findItem7.setVisible(false);
                        findItem8.setVisible(true);
                        findItem9.setVisible(true);
                    } else if (i2 == 2) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(false);
                        findItem6.setVisible(true);
                        findItem7.setVisible(false);
                        findItem8.setVisible(true);
                        findItem9.setVisible(false);
                    } else if (i2 == 7) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(false);
                        findItem7.setVisible(false);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(true);
                    } else if (i2 == 6) {
                        findItem4.setVisible(false);
                        findItem5.setVisible(false);
                        findItem6.setVisible(false);
                        findItem7.setVisible(false);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(false);
                    } else if (i2 == 8) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(true);
                        findItem7.setVisible(true);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(true);
                    } else if (i2 == 9) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(true);
                        findItem7.setVisible(true);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(true);
                    } else if (i2 == 10) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(true);
                        findItem7.setVisible(true);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(true);
                    } else if (i2 == 3) {
                        findItem4.setVisible(false);
                        findItem5.setVisible(false);
                        findItem6.setVisible(false);
                        findItem7.setVisible(false);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                    } else if (i2 == 11) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(true);
                        findItem6.setVisible(false);
                        findItem7.setVisible(true);
                        findItem8.setVisible(false);
                        findItem9.setVisible(false);
                        findItem3.setVisible(true);
                    } else if (i2 == 12) {
                        findItem4.setVisible(true);
                        findItem5.setVisible(false);
                        findItem6.setVisible(false);
                        findItem7.setVisible(false);
                        findItem8.setVisible(true);
                        findItem9.setVisible(false);
                        findItem3.setVisible(false);
                    }
                }
                this.f31538q.mo2142d(new C7177a(this));
            }
            this.f31538q.mo2143e();
            return;
        }
        this.f31539r.mo29495e();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m40614u() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26760f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m40615v() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26627c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m40616w(boolean z) {
        if (this.f31539r != null) {
            if (z) {
                C8287e.m45868s0();
            }
            this.f31539r.mo26694o();
            m40581D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m40617x() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26695p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m40618y() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26596g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m40619z() {
        C7970w wVar = this.f31539r;
        if (wVar != null) {
            wVar.mo26597h();
        }
    }

    /* renamed from: A */
    public void mo27430A(int i) {
        TextView textView = this.f31531j;
        if (textView != null) {
            textView.setTextSize((float) i);
        }
    }

    /* renamed from: B */
    public void mo27431B(boolean z, boolean z2) {
        C8345u.m46321b(this.f31533l, z, z2);
    }

    /* renamed from: C */
    public void mo27432C() {
        if (!C8345u.m46336q()) {
            ImageView imageView = this.f31532k;
            if (imageView != null) {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.back, R.color.default_text_color));
                return;
            }
            return;
        }
        ImageView imageView2 = this.f31532k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C8343s.m46304l(R.drawable.back_rtl, R.color.default_text_color));
        }
    }

    /* renamed from: F */
    public void mo27433F() {
        ImageView imageView = this.f31532k;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f31529h;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: G */
    public void mo27434G() {
    }

    /* renamed from: H */
    public void mo27435H() {
        this.f31531j.setTextColor(getResources().getColor(R.color.white));
        this.f31532k.setImageDrawable(C8343s.m46304l(C8345u.m46336q() ? R.drawable.back_rtl : R.drawable.back, R.color.white));
        this.f31526F.setImageDrawable(C8343s.m46298f(R.drawable.ic_toolbar_04));
    }

    /* renamed from: I */
    public void mo27436I() {
        TextView textView = this.f31531j;
        if (textView != null) {
            textView.setGravity(17);
            this.f31547z.setGravity(17);
            this.f31547z.setVisibility(8);
        }
    }

    /* renamed from: J */
    public void mo27437J() {
        RelativeLayout relativeLayout = this.f31527G;
        if (relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            this.f31527G.setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* renamed from: K */
    public void mo27438K() {
        TextView textView = this.f31531j;
        if (textView != null) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* renamed from: V */
    public void mo27439V() {
        GiftSwitchView giftSwitchView = this.f31521A;
        if (giftSwitchView != null) {
            giftSwitchView.mo32814p();
        }
    }

    /* renamed from: W */
    public void mo27440W(int i) {
        if (!C8345u.m46336q()) {
            ImageView imageView = this.f31532k;
            if (imageView != null) {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.back, i));
                return;
            }
            return;
        }
        ImageView imageView2 = this.f31532k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C8343s.m46304l(R.drawable.back_rtl, i));
        }
    }

    /* renamed from: X */
    public void mo27441X(int i) {
        ImageView imageView = this.f31534m;
        if (imageView != null) {
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.home_button04_more, i));
        }
    }

    /* renamed from: p */
    public void mo27442p() {
        m40611q();
        m40583L();
        m40584M();
    }

    public void setArtistTextSize(int i) {
        TextView textView = this.f31547z;
        if (textView != null) {
            textView.setTextSize((float) i);
        }
    }

    public void setArtistTitle(String str) {
        TextView textView = this.f31547z;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setBackIconVisible(boolean z) {
        ImageView imageView = this.f31532k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setEqIcon(boolean z) {
        this.f31535n.setVisibility(z ? 0 : 8);
    }

    public void setEqIconAdd(boolean z) {
        this.f31542u.setVisibility(z ? 0 : 8);
    }

    public void setEqResetIcon(boolean z) {
        this.f31544w.setVisibility(z ? 0 : 8);
    }

    public void setEqSaveIcon(boolean z) {
        this.f31543v.setVisibility(z ? 0 : 8);
    }

    public void setHomeIcon(boolean z) {
        int i = 0;
        this.f31529h.setVisibility(z ? 0 : 8);
        this.f31529h.setImageDrawable(C8343s.m46298f(R.drawable.ic_home_button01_sidebar));
        ImageView imageView = this.f31532k;
        if (z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setMenuIcon(boolean z) {
        this.f31534m.setVisibility(z ? 0 : 8);
    }

    public void setMoreMenuCallBack(boolean z) {
        this.f31524D = z;
    }

    public void setMutilIcon(boolean z) {
        this.f31536o.setVisibility(8);
    }

    public void setMyText(boolean z) {
        this.f31541t.setVisibility(z ? 0 : 8);
    }

    public void setOkIcon(boolean z) {
        this.f31526F.setVisibility(z ? 0 : 8);
    }

    public void setSearchIcon(boolean z) {
        this.f31537p.setVisibility(z ? 0 : 8);
    }

    public void setSort(int i) {
        if (this.f31546y != i) {
            this.f31538q = null;
        }
        this.f31546y = i;
    }

    public void setThemeIcon(boolean z) {
        this.f31540s.setVisibility(z ? 0 : 8);
    }

    public void setThemeRedPoint(boolean z) {
    }

    public void setTitleBackgroundColor(int i) {
        this.f31530i.setBackgroundColor(i);
    }

    public void setTitleHomeClick(View.OnClickListener onClickListener) {
        this.f31532k.setOnClickListener(onClickListener);
    }

    public void setTitleOnClickListener(C7970w wVar) {
        this.f31539r = wVar;
    }

    public void setTitleText(String str) {
        this.f31531j.setText(str);
    }

    public void setTitleTextAlpha(float f) {
        TextView textView = this.f31531j;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    public void setTitleTextColor(int i) {
        TextView textView = this.f31531j;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setUpGiftBadgeActionView(Context context) {
        GiftBadgeActionView giftBadgeActionView = this.f31523C;
        if (giftBadgeActionView != null) {
            giftBadgeActionView.mo32801c();
            this.f31523C.setVisibility(C9564d.m50184j(context) ? 0 : 8);
            C7970w wVar = this.f31539r;
            if (wVar != null) {
                wVar.mo26696s(this.f31523C);
            }
        }
    }

    public void setUpGiftBadgeActionViewResume(Context context) {
        setUpGiftBadgeActionView(context);
    }

    public void setUpToolbarGift(Activity activity) {
        GiftSwitchView giftSwitchView = this.f31521A;
        if (giftSwitchView != null && activity != null) {
            C9502v.m49923R(activity, giftSwitchView);
            this.f31521A.setVisibility(C9564d.m50184j(activity) ? 0 : 8);
            C7970w wVar = this.f31539r;
            if (wVar != null) {
                wVar.mo29497r(this.f31521A);
            }
        }
    }

    public void setViewPagerPosition(int i) {
        if (i == 0) {
            setMutilIcon(true);
            this.f31522B = true;
        } else {
            setMutilIcon(false);
            this.f31522B = false;
        }
        setSort(i);
    }

    public void setWeekIcon(boolean z) {
        this.f31525E.setVisibility(z ? 0 : 8);
    }

    public DeepDefaultTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31528g = context;
        mo27442p();
    }

    public DeepDefaultTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31528g = context;
    }
}
