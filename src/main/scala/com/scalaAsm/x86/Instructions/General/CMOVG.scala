package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait CMOVG extends InstructionDefinition {
  val mnemonic = "CMOVG"
}

object CMOVG extends TwoOperands[CMOVG] with CMOVGImpl

trait CMOVGImpl extends CMOVG {
  implicit object CMOVG_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVG_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVG_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
