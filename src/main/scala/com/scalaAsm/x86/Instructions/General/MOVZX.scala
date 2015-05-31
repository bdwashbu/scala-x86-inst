package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move with Zero-Extend
// Category: general/conver

trait MOVZX extends InstructionDefinition {
  val mnemonic = "MOVZX"
}

object MOVZX extends TwoOperands[MOVZX] with MOVZXImpl

trait MOVZXLow extends MOVZX {
  implicit object MOVZX_0 extends _2[r16, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object MOVZX_1 extends _2[r32, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object MOVZX_2 extends _2[r64, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }

  implicit object MOVZX_3 extends _2[r32, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object MOVZX_4 extends _2[r64, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}

trait MOVZXImpl extends MOVZXLow {
  implicit object MOVZX_5 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    val explicitFormat = new RegRmFormat{}
  }
}
