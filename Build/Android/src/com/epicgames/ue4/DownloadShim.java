package com.epicgames.ue4;

import com.ChengTou3D.TemplateHouse.OBBDownloaderService;
import com.ChengTou3D.TemplateHouse.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

