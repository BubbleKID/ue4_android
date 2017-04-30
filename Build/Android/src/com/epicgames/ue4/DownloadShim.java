package com.epicgames.ue4;

import com.ChengTou3D.bba.OBBDownloaderService;
import com.ChengTou3D.bba.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

