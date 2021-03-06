/*
 * Copyright (C) 2015-2017 Lightbend, Inc. All rights reserved.
 */
package com.typesafe.play.cachecontrol

object CacheDirectiveParserCompat {
  def toImmutableSeq[T](seq: Seq[T]): scala.collection.immutable.Seq[T] = {
    seq.to[scala.collection.immutable.Seq]
  }
}