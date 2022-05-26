package p159f.p166c.p224o.p226l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.content.C0506a;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4622d;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4627i;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.m */
/* compiled from: MenuExtensions.kt */
public final class C4663m {
    /* renamed from: a */
    public static final void m20168a(Menu menu, Context context) {
        Drawable icon;
        Drawable icon2;
        C8594l.m46771e(menu, "<this>");
        C8594l.m46771e(context, "context");
        int b = C4647b.m20153b(context, C4619a.videoToolbarIconColor, 0, 4, (Object) null);
        MenuItem findItem = menu.findItem(C4623e.action_delete);
        if (!(findItem == null || (icon2 = findItem.getIcon()) == null)) {
            C4659i.m20160a(icon2, b);
        }
        MenuItem findItem2 = menu.findItem(C4623e.action_select_all);
        if (findItem2 != null && (icon = findItem2.getIcon()) != null) {
            C4659i.m20160a(icon, b);
        }
    }

    /* renamed from: b */
    public static final void m20169b(Menu menu, Context context, boolean z) {
        C8594l.m46771e(menu, "<this>");
        C8594l.m46771e(context, "context");
        if (z) {
            MenuItem findItem = menu.findItem(C4623e.action_select_all);
            findItem.setTitle(context.getString(C4627i.coocent_deselect_all));
            Drawable d = C0506a.m3152d(context, C4622d.video_ic_deselect_all);
            if (d != null) {
                C4659i.m20160a(d, C4647b.m20153b(context, C4619a.videoToolbarIconSelectColor, 0, 4, (Object) null));
            }
            C8457t tVar = C8457t.f34900a;
            findItem.setIcon(d);
            return;
        }
        MenuItem findItem2 = menu.findItem(C4623e.action_select_all);
        findItem2.setTitle(context.getString(C4627i.coocent_select_all));
        Drawable d2 = C0506a.m3152d(context, C4622d.video_ic_select_all);
        if (d2 != null) {
            C4659i.m20160a(d2, C4647b.m20153b(context, C4619a.videoToolbarIconColor, 0, 4, (Object) null));
        }
        C8457t tVar2 = C8457t.f34900a;
        findItem2.setIcon(d2);
    }

    /* renamed from: c */
    private static final void m20170c(MenuItem menuItem, int i) {
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    /* renamed from: d */
    public static final void m20171d(Menu menu, Context context, int i) {
        C8594l.m46771e(menu, "<this>");
        C8594l.m46771e(context, "context");
        int b = C4647b.m20153b(context, C4619a.videoTextColorPrimary, 0, 4, (Object) null);
        int b2 = C4647b.m20153b(context, C4619a.videoTextColorPrimaryVariant, 0, 4, (Object) null);
        MenuItem findItem = menu.findItem(C4623e.action_view_list);
        MenuItem findItem2 = menu.findItem(C4623e.action_view_grid);
        if (i == 0) {
            C8594l.m46770d(findItem, "listViewMenuItem");
            m20170c(findItem, b2);
            C8594l.m46770d(findItem2, "gridViewMenuItem");
            m20170c(findItem2, b);
            return;
        }
        C8594l.m46770d(findItem2, "gridViewMenuItem");
        m20170c(findItem2, b2);
        C8594l.m46770d(findItem, "listViewMenuItem");
        m20170c(findItem, b);
    }
}
