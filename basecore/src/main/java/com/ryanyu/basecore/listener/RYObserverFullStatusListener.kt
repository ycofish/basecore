package com.ryanyu.basecore.listener

/**
 * Created by Ryan Yu on 17/12/2018.
 */

interface RYObserverFullStatusListener<T> {
    fun onNext(t: T)
    fun onFinish()
    fun onError()
}
