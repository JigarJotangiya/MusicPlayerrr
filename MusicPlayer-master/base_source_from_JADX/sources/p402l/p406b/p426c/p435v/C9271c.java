package p402l.p406b.p426c.p435v;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import p402l.p406b.p407a.p416i.C9047a;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p435v.p437h.C9278a;
import p402l.p406b.p426c.p435v.p437h.C9280c;
import p402l.p406b.p426c.p435v.p437h.C9282e;
import p402l.p406b.p426c.p435v.p437h.C9285h;
import p402l.p406b.p426c.p435v.p437h.C9286i;
import p402l.p406b.p426c.p435v.p437h.C9287j;
import p402l.p406b.p426c.p435v.p437h.C9288k;

/* renamed from: l.b.c.v.c */
/* compiled from: Mp4Tag */
public class C9271c extends C9047a {

    /* renamed from: i */
    private static final EnumMap<C9123c, C9269a> f35969i;

    static {
        EnumMap<C9123c, C9269a> enumMap = new EnumMap<>(C9123c.class);
        f35969i = enumMap;
        enumMap.put(C9123c.ALBUM, C9269a.ALBUM);
        enumMap.put(C9123c.ALBUM_ARTIST, C9269a.ALBUM_ARTIST);
        enumMap.put(C9123c.ALBUM_ARTIST_SORT, C9269a.ALBUM_ARTIST_SORT);
        enumMap.put(C9123c.ALBUM_SORT, C9269a.ALBUM_SORT);
        enumMap.put(C9123c.AMAZON_ID, C9269a.ASIN);
        enumMap.put(C9123c.ARTIST, C9269a.ARTIST);
        enumMap.put(C9123c.ARTIST_SORT, C9269a.ARTIST_SORT);
        enumMap.put(C9123c.ARTISTS, C9269a.ARTISTS);
        enumMap.put(C9123c.BARCODE, C9269a.BARCODE);
        enumMap.put(C9123c.BPM, C9269a.BPM);
        enumMap.put(C9123c.CATALOG_NO, C9269a.CATALOGNO);
        enumMap.put(C9123c.COMMENT, C9269a.COMMENT);
        enumMap.put(C9123c.COMPOSER, C9269a.COMPOSER);
        enumMap.put(C9123c.COMPOSER_SORT, C9269a.COMPOSER_SORT);
        enumMap.put(C9123c.CONDUCTOR, C9269a.CONDUCTOR);
        enumMap.put(C9123c.COVER_ART, C9269a.ARTWORK);
        enumMap.put(C9123c.CUSTOM1, C9269a.MM_CUSTOM_1);
        enumMap.put(C9123c.CUSTOM2, C9269a.MM_CUSTOM_2);
        enumMap.put(C9123c.CUSTOM3, C9269a.MM_CUSTOM_3);
        enumMap.put(C9123c.CUSTOM4, C9269a.MM_CUSTOM_4);
        enumMap.put(C9123c.CUSTOM5, C9269a.MM_CUSTOM_5);
        C9123c cVar = C9123c.DISC_NO;
        C9269a aVar = C9269a.DISCNUMBER;
        enumMap.put(cVar, aVar);
        enumMap.put(C9123c.DISC_SUBTITLE, C9269a.DISC_SUBTITLE);
        enumMap.put(C9123c.DISC_TOTAL, aVar);
        enumMap.put(C9123c.ENCODER, C9269a.ENCODER);
        enumMap.put(C9123c.FBPM, C9269a.FBPM);
        EnumMap<C9123c, C9269a> enumMap2 = f35969i;
        enumMap2.put(C9123c.GENRE, C9269a.GENRE);
        enumMap2.put(C9123c.GROUPING, C9269a.GROUPING);
        enumMap2.put(C9123c.ISRC, C9269a.ISRC);
        enumMap2.put(C9123c.IS_COMPILATION, C9269a.COMPILATION);
        enumMap2.put(C9123c.KEY, C9269a.KEY);
        enumMap2.put(C9123c.LANGUAGE, C9269a.LANGUAGE);
        enumMap2.put(C9123c.LYRICIST, C9269a.LYRICIST);
        enumMap2.put(C9123c.LYRICS, C9269a.LYRICS);
        enumMap2.put(C9123c.MEDIA, C9269a.MEDIA);
        enumMap2.put(C9123c.MOOD, C9269a.MOOD);
        enumMap2.put(C9123c.MUSICBRAINZ_ARTISTID, C9269a.MUSICBRAINZ_ARTISTID);
        enumMap2.put(C9123c.MUSICBRAINZ_DISC_ID, C9269a.MUSICBRAINZ_DISCID);
        enumMap2.put(C9123c.MUSICBRAINZ_ORIGINAL_RELEASE_ID, C9269a.MUSICBRAINZ_ORIGINALALBUMID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASEARTISTID, C9269a.MUSICBRAINZ_ALBUMARTISTID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASEID, C9269a.MUSICBRAINZ_ALBUMID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_COUNTRY, C9269a.RELEASECOUNTRY);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_GROUP_ID, C9269a.MUSICBRAINZ_RELEASE_GROUPID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_TRACK_ID, C9269a.MUSICBRAINZ_RELEASE_TRACKID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_STATUS, C9269a.MUSICBRAINZ_ALBUM_STATUS);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_TYPE, C9269a.MUSICBRAINZ_ALBUM_TYPE);
        enumMap2.put(C9123c.MUSICBRAINZ_TRACK_ID, C9269a.MUSICBRAINZ_TRACKID);
        enumMap2.put(C9123c.MUSICBRAINZ_WORK_ID, C9269a.MUSICBRAINZ_WORKID);
        enumMap2.put(C9123c.MUSICIP_ID, C9269a.MUSICIP_PUID);
        enumMap2.put(C9123c.OCCASION, C9269a.MM_OCCASION);
        enumMap2.put(C9123c.ORIGINAL_ALBUM, C9269a.MM_ORIGINAL_ALBUM_TITLE);
        EnumMap<C9123c, C9269a> enumMap3 = f35969i;
        enumMap3.put(C9123c.ORIGINAL_ARTIST, C9269a.MM_ORIGINAL_ARTIST);
        enumMap3.put(C9123c.ORIGINAL_LYRICIST, C9269a.MM_ORIGINAL_LYRICIST);
        enumMap3.put(C9123c.ORIGINAL_YEAR, C9269a.MM_ORIGINAL_YEAR);
        enumMap3.put(C9123c.QUALITY, C9269a.MM_QUALITY);
        enumMap3.put(C9123c.RATING, C9269a.SCORE);
        enumMap3.put(C9123c.RECORD_LABEL, C9269a.LABEL);
        enumMap3.put(C9123c.REMIXER, C9269a.REMIXER);
        enumMap3.put(C9123c.SCRIPT, C9269a.SCRIPT);
        enumMap3.put(C9123c.SUBTITLE, C9269a.SUBTITLE);
        enumMap3.put(C9123c.TAGS, C9269a.TAGS);
        enumMap3.put(C9123c.TEMPO, C9269a.TEMPO);
        enumMap3.put(C9123c.TITLE, C9269a.TITLE);
        enumMap3.put(C9123c.TITLE_SORT, C9269a.TITLE_SORT);
        C9123c cVar2 = C9123c.TRACK;
        C9269a aVar2 = C9269a.TRACK;
        enumMap3.put(cVar2, aVar2);
        enumMap3.put(C9123c.TRACK_TOTAL, aVar2);
        enumMap3.put(C9123c.URL_DISCOGS_ARTIST_SITE, C9269a.URL_DISCOGS_ARTIST_SITE);
        enumMap3.put(C9123c.URL_DISCOGS_RELEASE_SITE, C9269a.URL_DISCOGS_RELEASE_SITE);
        enumMap3.put(C9123c.URL_LYRICS_SITE, C9269a.URL_LYRICS_SITE);
        enumMap3.put(C9123c.URL_OFFICIAL_ARTIST_SITE, C9269a.URL_OFFICIAL_ARTIST_SITE);
        enumMap3.put(C9123c.URL_OFFICIAL_RELEASE_SITE, C9269a.URL_OFFICIAL_RELEASE_SITE);
        enumMap3.put(C9123c.URL_WIKIPEDIA_ARTIST_SITE, C9269a.URL_WIKIPEDIA_ARTIST_SITE);
        enumMap3.put(C9123c.URL_WIKIPEDIA_RELEASE_SITE, C9269a.URL_WIKIPEDIA_RELEASE_SITE);
        enumMap3.put(C9123c.YEAR, C9269a.DAY);
        enumMap3.put(C9123c.ENGINEER, C9269a.ENGINEER);
        enumMap3.put(C9123c.PRODUCER, C9269a.PRODUCER);
        enumMap3.put(C9123c.DJMIXER, C9269a.DJMIXER);
        EnumMap<C9123c, C9269a> enumMap4 = f35969i;
        enumMap4.put(C9123c.MIXER, C9269a.MIXER);
        enumMap4.put(C9123c.ARRANGER, C9269a.ARRANGER);
        enumMap4.put(C9123c.ACOUSTID_FINGERPRINT, C9269a.ACOUSTID_FINGERPRINT);
        enumMap4.put(C9123c.ACOUSTID_ID, C9269a.ACOUSTID_ID);
        enumMap4.put(C9123c.COUNTRY, C9269a.COUNTRY);
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        if (cVar != null) {
            List<C9132l> i = mo31525i(f35969i.get(cVar).getFieldName());
            ArrayList arrayList = new ArrayList();
            if (cVar == C9123c.KEY) {
                return i.size() == 0 ? mo31525i(C9269a.KEY_OLD.getFieldName()) : i;
            }
            if (cVar == C9123c.GENRE) {
                return i.size() == 0 ? mo31525i(C9269a.GENRE_CUSTOM.getFieldName()) : i;
            }
            if (cVar == C9123c.TRACK) {
                for (C9132l next : i) {
                    if (((C9288k) next).mo32136h().shortValue() > 0) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            } else if (cVar == C9123c.TRACK_TOTAL) {
                for (C9132l next2 : i) {
                    if (((C9288k) next2).mo32137i().shortValue() > 0) {
                        arrayList.add(next2);
                    }
                }
                return arrayList;
            } else if (cVar == C9123c.DISC_NO) {
                for (C9132l next3 : i) {
                    if (((C9278a) next3).mo32127h().shortValue() > 0) {
                        arrayList.add(next3);
                    }
                }
                return arrayList;
            } else if (cVar != C9123c.DISC_TOTAL) {
                return i;
            } else {
                for (C9132l next4 : i) {
                    if (((C9278a) next4).mo32128i().shortValue() > 0) {
                        arrayList.add(next4);
                    }
                }
                return arrayList;
            }
        } else {
            throw new C9128h();
        }
    }

    /* renamed from: e */
    public void mo31521e(C9123c cVar, String str) throws C9128h, C9122b {
        C9132l g = mo31523g(cVar, str);
        if (cVar == C9123c.GENRE) {
            String D = g.mo31497D();
            C9269a aVar = C9269a.GENRE;
            if (D.equals(aVar.getFieldName())) {
                mo32117n(C9269a.GENRE_CUSTOM);
            } else if (g.mo31497D().equals(C9269a.GENRE_CUSTOM.getFieldName())) {
                mo32117n(aVar);
            }
        }
        mo31528k(g);
    }

    /* renamed from: g */
    public C9132l mo31523g(C9123c cVar, String str) throws C9128h, C9122b {
        if (str == null) {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (cVar != null) {
            C9123c cVar2 = C9123c.TRACK;
            if (cVar == cVar2 || cVar == C9123c.TRACK_TOTAL || cVar == C9123c.DISC_NO || cVar == C9123c.DISC_TOTAL) {
                try {
                    int parseInt = Integer.parseInt(str);
                    if (cVar == cVar2) {
                        return new C9288k(parseInt);
                    }
                    if (cVar == C9123c.TRACK_TOTAL) {
                        return new C9288k(0, parseInt);
                    }
                    if (cVar == C9123c.DISC_NO) {
                        return new C9278a(parseInt);
                    }
                    if (cVar == C9123c.DISC_TOTAL) {
                        return new C9278a(0, parseInt);
                    }
                } catch (NumberFormatException e) {
                    throw new C9122b("Value " + str + " is not a number as required", e);
                }
            } else if (cVar == C9123c.GENRE) {
                if (C9134n.m48562h().mo31730E()) {
                    return new C9286i(C9269a.GENRE_CUSTOM.getFieldName(), str);
                }
                if (C9280c.m49243h(str)) {
                    return new C9280c(str);
                }
                return new C9286i(C9269a.GENRE_CUSTOM.getFieldName(), str);
            }
            return mo32116m(f35969i.get(cVar), str);
        } else {
            throw new C9128h();
        }
    }

    /* renamed from: k */
    public void mo31528k(C9132l lVar) {
        if (lVar != null) {
            if (lVar.mo31497D().equals(C9269a.TRACK.getFieldName())) {
                List list = this.f35526h.get(lVar.mo31497D());
                if (list == null || list.size() == 0) {
                    super.mo31528k(lVar);
                    return;
                }
                C9288k kVar = (C9288k) list.get(0);
                C9288k kVar2 = (C9288k) lVar;
                Short h = kVar.mo32136h();
                Short i = kVar.mo32137i();
                if (kVar2.mo32136h().shortValue() > 0) {
                    h = kVar2.mo32136h();
                }
                if (kVar2.mo32137i().shortValue() > 0) {
                    i = kVar2.mo32137i();
                }
                super.mo31528k(new C9288k((int) h.shortValue(), (int) i.shortValue()));
            } else if (lVar.mo31497D().equals(C9269a.DISCNUMBER.getFieldName())) {
                List list2 = this.f35526h.get(lVar.mo31497D());
                if (list2 == null || list2.size() == 0) {
                    super.mo31528k(lVar);
                    return;
                }
                C9278a aVar = (C9278a) list2.get(0);
                C9278a aVar2 = (C9278a) lVar;
                Short h2 = aVar.mo32127h();
                Short i2 = aVar.mo32128i();
                if (aVar2.mo32127h().shortValue() > 0) {
                    h2 = aVar2.mo32127h();
                }
                if (aVar2.mo32128i().shortValue() > 0) {
                    i2 = aVar2.mo32128i();
                }
                super.mo31528k(new C9278a((int) h2.shortValue(), (int) i2.shortValue()));
            } else {
                super.mo31528k(lVar);
            }
        }
    }

    /* renamed from: l */
    public C9132l mo32115l(boolean z) throws C9128h, C9122b {
        if (z) {
            String str = C9282e.f35985n;
            C9269a aVar = C9269a.COMPILATION;
            return new C9282e(aVar, str, aVar.getFieldLength());
        }
        String str2 = C9282e.f35986o;
        C9269a aVar2 = C9269a.COMPILATION;
        return new C9282e(aVar2, str2, aVar2.getFieldLength());
    }

    /* renamed from: m */
    public C9132l mo32116m(C9269a aVar, String str) throws C9128h, C9122b {
        if (str == null) {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (aVar == null) {
            throw new C9128h();
        } else if (aVar == C9269a.COMPILATION) {
            if (str.equalsIgnoreCase("true") || str.equals("1")) {
                return mo32115l(true);
            }
            return mo32115l(false);
        } else if (aVar != C9269a.GENRE) {
            C9269a aVar2 = C9269a.GENRE_CUSTOM;
            if (aVar == aVar2) {
                return new C9286i(aVar2.getFieldName(), str);
            }
            if (aVar.getSubClassFieldType() == C9274f.DISC_NO) {
                return new C9278a(str);
            }
            if (aVar.getSubClassFieldType() == C9274f.TRACK_NO) {
                return new C9288k(str);
            }
            if (aVar.getSubClassFieldType() == C9274f.BYTE) {
                return new C9282e(aVar, str, aVar.getFieldLength());
            }
            if (aVar.getSubClassFieldType() == C9274f.NUMBER) {
                return new C9287j(aVar.getFieldName(), str);
            }
            if (aVar.getSubClassFieldType() == C9274f.REVERSE_DNS) {
                return new C9285h(aVar, str);
            }
            if (aVar.getSubClassFieldType() == C9274f.ARTWORK) {
                throw new UnsupportedOperationException(C9118b.ARTWORK_CANNOT_BE_CREATED_WITH_THIS_METHOD.getMsg());
            } else if (aVar.getSubClassFieldType() == C9274f.TEXT) {
                return new C9286i(aVar.getFieldName(), str);
            } else {
                if (aVar.getSubClassFieldType() == C9274f.UNKNOWN) {
                    throw new UnsupportedOperationException(C9118b.DO_NOT_KNOW_HOW_TO_CREATE_THIS_ATOM_TYPE.getMsg(aVar.getFieldName()));
                }
                throw new UnsupportedOperationException(C9118b.DO_NOT_KNOW_HOW_TO_CREATE_THIS_ATOM_TYPE.getMsg(aVar.getFieldName()));
            }
        } else if (C9280c.m49243h(str)) {
            return new C9280c(str);
        } else {
            throw new IllegalArgumentException(C9118b.NOT_STANDARD_MP$_GENRE.getMsg());
        }
    }

    /* renamed from: n */
    public void mo32117n(C9269a aVar) throws C9128h {
        if (aVar != null) {
            super.mo31524h(aVar.getFieldName());
            return;
        }
        throw new C9128h();
    }

    public String toString() {
        return "Mpeg4 " + super.toString();
    }
}
