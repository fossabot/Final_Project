package org.kh.dajob.notice.controller;

import org.kh.dajob.notice.model.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
}
