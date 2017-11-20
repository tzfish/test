package com.train.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Maps;
import com.train.exception.ParamException;
import com.train.exception.ResponseData;
import com.train.util.UUIDUtil;


public class FileUpload {
	
	
	// 文件上传
		@RequestMapping(value = "/uploadDeployPack", method = RequestMethod.POST)
		public Object uploadDeployPack(HttpServletRequest request, MultipartFile file)
				throws Exception {
			if (file == null) {
				throw new ParamException("请选择文件");
			}
			String subsysid = request.getParameter("subsysid");
			String versionnumber = request.getParameter("version");
			String remark = request.getParameter("remark");

			Map<String, String> params = Maps.newHashMap();
			params.put("subsysid", subsysid);
			params.put("versionnumber", versionnumber);
			params.put("remark", remark);

			String filePath = System.getProperty("user.dir");
			String originalFilename = file.getOriginalFilename();
			String savepath = "/upload/" + DateFormatUtils.format(new Date(), "yyyyMMdd") + "/";
			String name = UUIDUtil.uuid();
			String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
			String fileName = name.concat("_" + versionnumber + "." + extension);
			String loadpath = filePath + savepath;
			File file1 = new File(loadpath);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			try {
				InputStream is = file.getInputStream();
				OutputStream os = new FileOutputStream(loadpath + fileName);
				int len = 0;
				byte[] buffer = new byte[400];
				while ((len = is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
				is.close();
				os.close();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("filename", originalFilename);
				map.put("loadpath", savepath + fileName);
				params.put("filepath", savepath + fileName);
				return ResponseData.success(map);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new ParamException("上传失败");
			}
		}

}
