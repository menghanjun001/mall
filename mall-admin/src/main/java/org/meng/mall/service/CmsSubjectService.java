package org.meng.mall.service;

import org.meng.mall.model.CmsSubject;

import java.util.List;

/**
 * @Created by menghanjun
 * @Date 2020/11/25 9:06 下午
 */
public interface CmsSubjectService {
    List<CmsSubject> listAll();

    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
