/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

@file:Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER", "unused")

package net.mamoe.mirai.console.setting

import net.mamoe.mirai.console.setting.internal.valueImpl
import kotlin.internal.LowPriorityInOverloadResolution


/**
 * !!! This file is auto-generated by backend/codegen/src/kotlin/net.mamoe.mirai.console.codegen.SettingValueUseSiteCodegen.kt
 * !!! DO NOT MODIFY THIS FILE MANUALLY
 */


fun Setting.value(default: Int): IntValue = valueImpl(default)
fun Setting.value(default: Short): ShortValue = valueImpl(default)
fun Setting.value(default: Byte): ByteValue = valueImpl(default)
fun Setting.value(default: Long): LongValue = valueImpl(default)
fun Setting.value(default: Float): FloatValue = valueImpl(default)
fun Setting.value(default: Double): DoubleValue = valueImpl(default)
fun Setting.value(default: Boolean): BooleanValue = valueImpl(default)
fun Setting.value(default: Char): CharValue = valueImpl(default)
fun Setting.value(default: String): StringValue = valueImpl(default)
fun Setting.value(default: IntArray): IntArrayValue = valueImpl(default)
fun Setting.value(default: ShortArray): ShortArrayValue = valueImpl(default)
fun Setting.value(default: ByteArray): ByteArrayValue = valueImpl(default)
fun Setting.value(default: LongArray): LongArrayValue = valueImpl(default)
fun Setting.value(default: FloatArray): FloatArrayValue = valueImpl(default)
fun Setting.value(default: DoubleArray): DoubleArrayValue = valueImpl(default)
fun Setting.value(default: BooleanArray): BooleanArrayValue = valueImpl(default)
fun Setting.value(default: CharArray): CharArrayValue = valueImpl(default)
fun Setting.value(default: Array<Int>): TypedIntArrayValue = valueImpl(default)
fun Setting.value(default: Array<Short>): TypedShortArrayValue = valueImpl(default)
fun Setting.value(default: Array<Byte>): TypedByteArrayValue = valueImpl(default)
fun Setting.value(default: Array<Long>): TypedLongArrayValue = valueImpl(default)
fun Setting.value(default: Array<Float>): TypedFloatArrayValue = valueImpl(default)
fun Setting.value(default: Array<Double>): TypedDoubleArrayValue = valueImpl(default)
fun Setting.value(default: Array<Boolean>): TypedBooleanArrayValue = valueImpl(default)
fun Setting.value(default: Array<Char>): TypedCharArrayValue = valueImpl(default)
fun Setting.value(default: Array<String>): TypedStringArrayValue = valueImpl(default)
fun Setting.value(default: List<Int>): IntListValue = valueImpl(default)
fun Setting.value(default: List<Short>): ShortListValue = valueImpl(default)
fun Setting.value(default: List<Byte>): ByteListValue = valueImpl(default)
fun Setting.value(default: List<Long>): LongListValue = valueImpl(default)
fun Setting.value(default: List<Float>): FloatListValue = valueImpl(default)
fun Setting.value(default: List<Double>): DoubleListValue = valueImpl(default)
fun Setting.value(default: List<Boolean>): BooleanListValue = valueImpl(default)
fun Setting.value(default: List<Char>): CharListValue = valueImpl(default)
fun Setting.value(default: List<String>): StringListValue = valueImpl(default)
fun Setting.value(default: Set<Int>): IntSetValue = valueImpl(default)
fun Setting.value(default: Set<Short>): ShortSetValue = valueImpl(default)
fun Setting.value(default: Set<Byte>): ByteSetValue = valueImpl(default)
fun Setting.value(default: Set<Long>): LongSetValue = valueImpl(default)
fun Setting.value(default: Set<Float>): FloatSetValue = valueImpl(default)
fun Setting.value(default: Set<Double>): DoubleSetValue = valueImpl(default)
fun Setting.value(default: Set<Boolean>): BooleanSetValue = valueImpl(default)
fun Setting.value(default: Set<Char>): CharSetValue = valueImpl(default)
fun Setting.value(default: Set<String>): StringSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Int>): MutableIntListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Short>): MutableShortListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Byte>): MutableByteListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Long>): MutableLongListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Float>): MutableFloatListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Double>): MutableDoubleListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Boolean>): MutableBooleanListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<Char>): MutableCharListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableList<String>): MutableStringListValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Int>): MutableIntSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Short>): MutableShortSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Byte>): MutableByteSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Long>): MutableLongSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Float>): MutableFloatSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Double>): MutableDoubleSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Boolean>): MutableBooleanSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<Char>): MutableCharSetValue = valueImpl(default)

@JvmName("valueMutable")
fun Setting.value(default: MutableSet<String>): MutableStringSetValue = valueImpl(default)

fun <T : Setting> Setting.value(default: T): Value<T> {
    require(this::class != default::class) {
        "Recursive nesting is prohibited"
    }
    return valueImpl(default)
}

inline fun <T : Setting> Setting.value(default: T, crossinline initializer: T.() -> Unit): Value<T> =
    value(default).also { it.value.apply(initializer) }

inline fun <reified T : Setting> Setting.value(default: List<T>): SettingListValue<T> = valueImpl(default)

@JvmName("valueMutable")
inline fun <reified T : Setting> Setting.value(default: MutableList<T>): MutableSettingListValue<T> = valueImpl(default)


inline fun <reified T : Setting> Setting.value(default: Set<T>): SettingSetValue<T> = valueImpl(default)

@JvmName("valueMutable")
inline fun <reified T : Setting> Setting.value(default: MutableSet<T>): MutableSettingSetValue<T> = valueImpl(default)

/**
 * 创建一个只引用对象而不跟踪其属性的值.
 *
 * @param T 类型. 必须拥有 [kotlinx.serialization.Serializable] 注解 (因此编译器会自动生成序列化器)
 */
@DangerousReferenceOnlyValue
@JvmName("valueDynamic")
@LowPriorityInOverloadResolution
inline fun <reified T : Any> Setting.value(default: T): Value<T> = valueImpl(default)

@RequiresOptIn(
    """
    这种只保存引用的 Value 可能会导致意料之外的结果, 在使用时须保持谨慎.
    对值的改变不会触发自动保存, 也不会同步到 UI 中. 在 UI 中只能编辑序列化之后的值.
""", level = RequiresOptIn.Level.WARNING
)
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.FUNCTION)
annotation class DangerousReferenceOnlyValue

