package com.ley.enojbackendjudgeservice.judge.codesandbox;


import com.ley.enojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.ley.enojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
